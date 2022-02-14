package com.example.algo1.sort.mergenquick;

public class ThreeWaySort extends SortAlgoGeneric<String> {

	public ThreeWaySort(String[] givenArr) {
		super(givenArr);
		
	}

	protected void sort(String[] array, int lo, int hi) {
		if(hi<=lo) return;
		int lt = lo, gt=hi;
		int i = lo;// vid has i=lo; i=lo+1;
		while(i<=gt) {
			if(compare(array, lt, i)<0) {
				exchange(array,gt--,i);
				hi--;
			}else if (compare(array, lt, i) >0) {
				exchange(array,lt++,i++);
			} else {
				i++;
			}
		}
		sort(array, lo, lt-1);
		sort(array, gt+1, hi);
	}
	
	@Override
	public void sort() {
		sort(arr,0,arr.length);
		
	}

}
