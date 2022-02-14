package com.example.algo1.searchsort;

import org.junit.jupiter.api.Test;

import com.example.algo1.sort.InsertionSort;
import com.example.algo1.sort.SelectionSort;
import com.example.algo1.sort.ShellSortH;
import com.example.algo1.sort.mergenquick.MergeSort;
import com.example.algo1.sort.mergenquick.QuickSelection;
import com.example.algo1.sort.mergenquick.QuickSort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortTest {
	@Test
	void selectionSortTest() {
		int[] arr = new int[] {8,2,1,3,4,33,11,77,30,14,9};
		SelectionSort ss = new SelectionSort(arr);

		ss.print();
		ss.sort();
		ss.print();
	}
	@Test
	void insertionSortTest() {
		int[] arr = new int[] {8,2,1,3,4,33,11,77,30,14,9};
		InsertionSort ss = new InsertionSort(arr);

		ss.print();
		ss.sort();
		ss.print();
	
	}
	@Test
	void shellSortTest() {
		String[] arr = new String[] {"S","O","R","T","E","X","A","M", "P","L","E"};
		ShellSortH ss = new ShellSortH(arr);

		ss.print();
		ss.sort();
		ss.print();
	
	}
	
	@Test
	void mergeSortTest() {
		String[] arr = new String[] {"E","L","L","O","P","P","A", "P","P","U", "W", "Z"};
		MergeSort ss = new MergeSort(arr);

		ss.print();
		ss.sort1(5); //ss.sort2(5);
		ss.print();
	
	}
	
	@Test
	void mergeSortRecursiveTest() {
		String[] arr = new String[] {"S","O","R","T","E","X","A","M", "P","L","E"};
		MergeSort ss = new MergeSort(arr);

		ss.print();
		ss.sort();
		ss.print();
	
	}
	
	@Test
	void mergeTest() {
		String[] arr = new String[] {"E", "O", "R", "S", "T", "X", "A", "E", "L", "M", "P"};
		MergeSort ss = new MergeSort(arr);

		ss.print();
		ss.merge(arr,new String[arr.length],0,5,arr.length-1);
		ss.print();
	
	}
	
	@Test
	void quickSortTest() {
		String[] arr = "QUICKSORTEXAMPLE".split("");
		QuickSort qs = new QuickSort(arr);
		qs.print();
		qs.sort();
		//qs.partition(arr,0,1,arr.length-1);
		qs.print();
	}
	
	@Test
	void quickSortSelectionTest() {
		String[] arr = "QUICKSORTEXAMPLE".split("");
		QuickSelection qs = new QuickSelection(arr);
		qs.print();
		log.info(qs.select(9));
		//qs.partition(arr,0,1,arr.length-1);
		qs.print();
	}
	
	@Test
	void threewaySortTest() {
		String[] arr = "QUICKSORTEXAMPLE".split("");
		QuickSelection qs = new QuickSelection(arr);
		qs.print();
		qs.sort();
		qs.print();
	}
	
}
