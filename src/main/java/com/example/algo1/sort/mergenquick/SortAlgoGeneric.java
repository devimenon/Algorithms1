package com.example.algo1.sort.mergenquick;

import java.util.Arrays;
import java.util.Comparator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class SortAlgoGeneric<T extends Comparable<T>> {

	public T[] arr;
	
	public abstract void sort();
	
	public void print() {
		log.info(Arrays.toString(arr));
	}
	
	public void print(T[] a) {
		log.info(Arrays.toString(a));
	}
	public SortAlgoGeneric(T[] givenArr){
		this.arr=givenArr;
	}
	public void exchange(T[] array, int i, int j) {
		T temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		//log.info(Arrays.toString(array));
	}
	
	public int compare(T[] array, int i, int j) {
		return array[i].compareTo(array[j]);
		
	}
	
	public int compare(Comparator<T> comparator, T[] array, int i, int j) {
		return comparator.compare(array[i], array[j]);
	}
	
	public int compare(T a, T b) {
		return a.compareTo(b);
	}
}
