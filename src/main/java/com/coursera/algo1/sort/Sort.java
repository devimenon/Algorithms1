package com.coursera.algo1.sort;

public abstract class Sort<T extends Comparable<T>>{
	
	T arr[];
	
	Sort(T []arr){
		this.arr=arr;
	}
	
	abstract void sort();
	
	boolean less(T val1, T val2){
		return val1.compareTo(val2)<0;
	}
	
	void exchange(int a, int b){
		T temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	
	
	void print(){
		for(T val: arr){
			System.out.print(val +" ");
		}
		System.out.println();
		
	}
}
