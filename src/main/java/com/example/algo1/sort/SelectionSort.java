package com.example.algo1.sort;

import java.util.Arrays;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSort extends SortAlgo{
	
	
	SelectionSort(int size) {
		super(size);
	}

	public SelectionSort(int[] arr) {
		super(arr);
	}
	
	public void sort() {
		for(int i=0; i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				min = compare(min,j) < 0 ? min : j;
			}
			exchange(i,min);
		}
	}
	
}
