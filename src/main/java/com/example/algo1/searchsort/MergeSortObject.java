package com.example.algo1.searchsort;

import java.util.Arrays;
import java.util.Comparator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSortObject<T extends Comparable<T>> {

	T[] arr;
	MergeSortObject(T[] array) {
		this.arr = array;
	}

	void print() {
		log.info(Arrays.toString(arr));
	}
	
	//works as in algo video
	void merge(Comparator<T> comparator, T[] a, T[] aux, int lo, int mid, int hi) {
		for(int i=lo;i<=hi;i++) {
			aux[i]=a[i];
		}
		int i = lo, j = mid+1; 
		//print();
		for(int k = lo; k<=hi;k++) {
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(compare(comparator,aux,i,j)<=0) a[k]=aux[i++];
			else a[k]=aux[j++];
		}
	}

	void sort(Comparator<T> comparator, T[] a, T[] aux, int lo, int hi) {
		if( hi <= lo) return;
		int mid = lo + (hi-lo)/2;
		sort(comparator, a, aux, lo, mid);
		sort(comparator, a, aux, mid+1, hi);
		merge(comparator, a, aux, lo, mid, hi);
	}
	
	
	void sort(T[] array, T[] aux, Comparator<T> comparator) {
		sort(comparator, array, aux, 0, array.length-1);
	}
	
	int compare(Comparator<T> comparator, T[] array, int i, int j) {
		return comparator.compare(array[i], array[j]);
	}

}
