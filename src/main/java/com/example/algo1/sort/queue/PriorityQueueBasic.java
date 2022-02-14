package com.example.algo1.sort.queue;

import com.example.algo1.sort.mergenquick.ThreeWaySort;

public class PriorityQueueBasic extends ThreeWaySort{

	public PriorityQueueBasic(String[] givenArr) {
		super(givenArr);
	}
	
	public PriorityQueueBasic(int k) {
		super( new String[k]);
		
	}

	int pntr=0;
	void insert(String str) {
		arr[++pntr]=str;
		//sort();
	}
	
	void Min() {
		
	}
	
	String delMax() {
		int max = 0;
		for(int i=1;i<pntr;i++) {
			if(compare(arr,max,i)<0) max=i;
		}
		exchange(arr, pntr-1, max);
		return arr[--pntr];
	}
	
	@Override
	public void sort() {
		super.sort(arr,0,pntr-1);
	}

}
