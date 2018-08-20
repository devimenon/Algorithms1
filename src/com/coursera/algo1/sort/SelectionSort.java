package com.coursera.algo1.sort;

public class SelectionSort<T extends Comparable<T>> {
	T arr[];
	SelectionSort(T []arr){
		this.arr=arr;
	}
	void sort(){
		
		for(int i=0; i<arr.length;i++){
			T val = arr[i];
			int pos = i;
			for(int j = i+1; j< arr.length;j++){
				if(less(val,arr[j])){
					val = arr[j];
					pos=j;
				}			
			}
			exchange(i,pos);			
		}	
	}
	
	boolean less(T val1, T val2){
		return val1.compareTo(val2)>0;
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
	
	public static void main(String[] args) {
		SelectionSort<Integer> intArray = new SelectionSort<Integer>(new Integer[]{12, 6,3,4,1,2,7, 2});
		intArray.sort();
		intArray.print();
		SelectionSort<String> strArray = new SelectionSort<String>(new String[]{"new", "test", "of", "sort", "this", "algo"});
		strArray.sort();
		strArray.print();
		
	}

}
