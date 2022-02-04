package com.example.algo1.searchsort;

public class InsertionSort extends SortAlgo{

	InsertionSort(int size) {
		super(size);
	}

	InsertionSort(int[] arr) {
		super(arr);
	}
	@Override
	void sort() {

		for(int i = 0; i<arr.length;i++) {
			
			for(int j = i+1;j >0 && j<arr.length;j--) {
				if(compare(j-1,j)>0) {
					exchange(j-1, j);
				} else {
					break;
				}
				
			}
		}
	}

}
