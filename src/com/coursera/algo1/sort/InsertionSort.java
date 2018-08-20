package com.coursera.algo1.sort;

public class InsertionSort<T extends Comparable<T>> extends Sort<T>{
	
	InsertionSort(T[] arr) {
		super(arr);
	}

	void sort(){
		for(int i=0; i<arr.length;i++){
			
			for(int j=i; j>0;j--){
				
				if(less(arr[j],arr[j-1])){
					exchange(j,j-1);	
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		InsertionSort<Integer> intArray = new InsertionSort<Integer>(new Integer[]{12, 6,3,4,1,2,7, 2});
		intArray.sort();
		intArray.print();
		InsertionSort<String> strArray = new InsertionSort<String>(new String[]{"new", "test", "of", "sort", "this", "algo"});
		strArray.sort();
		strArray.print();
	}
	
	

}
