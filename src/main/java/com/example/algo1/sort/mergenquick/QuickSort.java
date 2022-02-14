package com.example.algo1.sort.mergenquick;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort extends SortAlgoGeneric<String>{

	public QuickSort(String[] givenArr) {
		super(givenArr);
	}


	// as in vid. works
	int  partition(String [] array, int lo, int hi) {
		int i = lo;
		int j=hi+1;
		while(true) {

			while(compare(array, ++i, lo) <= 0) {
				if(i==hi) break;
			} 
			while(compare(array, lo, --j) <= 0) {
				if(j==lo) break;
			} 

			if(i>=j) break;
			exchange(array,i,j);

		}

		exchange(array, lo, j);
		print();
		return j;


	}

	//as in vid works
	void sort(String[] array, int lo, int hi) {
		if(hi<=lo) return;

		int mid = partition(array,lo,hi);//lo+(hi-lo)/2;
		sort(array, lo, mid);
		sort(array, mid+1, hi);

	}

	//2nd Quick sort algo - mine
	int  partition(String [] array, int lo, int i, int j) {
		if(i>j) {
			//log.info("j = {}", j);
			exchange(array, lo, j);
			print();
			return j;
		}
		if(compare(array, i, lo) <= 0) {
			i++;
		} else if(compare(array, lo, j) <= 0) {
			j--;
		} else {
			exchange(array, i, j);
		}
		return partition(array,lo,i,j);

	}
	//works mine logic
	void sort(String[] array, int p, int lo, int hi) {
		if(hi<lo) return;

		int mid = partition(array,p,lo,hi);//lo+(hi-lo)/2;
		sort(array, p,lo, mid);
		sort(array, mid+1,mid+2, hi);

	}
	@Override
	public void sort() {
		//sort(arr,0,arr.length-1);
		sort(arr,0,1,arr.length-1);

	}


}
