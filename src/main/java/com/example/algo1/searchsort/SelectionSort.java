package com.example.algo1.searchsort;

import java.util.Arrays;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSort extends SortAlgo{
	
	
	SelectionSort(int size) {
		super(size);
	}

	SelectionSort(int[] arr) {
		super(arr);
	}
	
	void sort() {
		for(int i=0; i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				min = compare(min,j) < 0 ? min : j;
			}
			exchange(i,min);
		}
	}
	
}
