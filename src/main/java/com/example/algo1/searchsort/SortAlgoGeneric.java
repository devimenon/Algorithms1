package com.example.algo1.searchsort;

import java.util.Arrays;
import java.util.Comparator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class SortAlgoGeneric<T extends Comparable<T>> {

	T[] arr;
	
	abstract void sort();
	
	void print() {
		log.info(Arrays.toString(arr));
	}
	
	
	SortAlgoGeneric(T[] givenArr){
		this.arr=givenArr;
	}
	void exchange(T[] array, int i, int j) {
		T temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		//log.info(Arrays.toString(array));
	}
	
	int compare(T[] array, int i, int j) {
		return array[i].compareTo(array[j]);
		
	}
	
	int compare(Comparator<T> comparator, T[] array, int i, int j) {
		return comparator.compare(array[i], array[j]);
	}
}
