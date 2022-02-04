package com.example.algo1.searchsort;

public class MergeSort extends SortAlgoGeneric<String>{

	MergeSort(String[] givenArr) {
		super(givenArr);
	}

	//works
	void sort1(int mid) {
		String[] temp = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		int in = 0, m = mid+1;
		for (int i=0; i<arr.length;i++) {
			if(in <= mid && compare(temp,in,m)<=0) {
				arr[i] = temp[in++];
			} else {
				arr[i] = temp[m++];
			}
		}
	}
	
	//works as in algo video
	void merge(String[] a, String[] aux, int lo, int mid, int hi) {
		for(int i=lo;i<=hi;i++) {
			aux[i]=a[i];
		}
		int i = lo, j = mid+1; 
		print();
		for(int k = lo; k<=hi;k++) {
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(compare(aux,i,j)<=0) a[k]=aux[i++];
			else a[k]=aux[j++];
		}
	}
	
	//works as in algo video
		void merge1(String[] a, String[] aux, int lo, int mid, int hi) {
			for(int i=lo;i<=hi;i++) {
				aux[i]=a[i];
			}
			int i = lo, j = mid+1; 
			print();
			for(int k = lo; k<=hi;k++) {
				if(i>mid) a[k]=aux[j++];
				else if(j>hi) a[k]=aux[i++];
				else if(compare(a,i,j)<=0) a[k]=aux[i++];
				else a[k]=aux[j++];
			}
		}
	void sort2(int mid) {
		merge(arr,new String[arr.length],0,mid,arr.length);
	}

	void sort(String[] a, String[] aux, int lo, int hi) {
		if( hi <= lo) return;
		int mid = lo + (hi-lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	@Override
	void sort() {
		// TODO Auto-generated method stub
		sort(arr, new String[arr.length],0, arr.length-1);
		
	}

}
