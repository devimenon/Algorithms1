package com.coursera.algo1.sort;

public class ShellSort<T extends Comparable<T>> extends Sort<T> {
	int [] sortLength;
	ShellSort(T[] arr, int[] sort) {
		super(arr);
		this.sortLength=sort;
	}
	

	@Override
	void sort() {		
		for(int step : sortLength){
			sortShell(step);
		}
			
	}
	
	void sortShell(int step){
		System.out.println(" -- "+step);	
		for(int i=0; i<arr.length;i+=step){
			
			for(int j=i; j>0;j-=step){
				
				if(less(arr[j],arr[j-step])){
					
					
					System.out.println("i="+i);
					System.out.println("j="+j);
					exchange(j,j-step);
					print();
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		ShellSort<Integer> intArray = new ShellSort<Integer>(new Integer[]{12, 6,3,4,1,24,7, 2,19,14,5}, new int[] {5,2});
		intArray.sort();
		intArray.print();
		/*ShellSort<String> strArray = new ShellSort<String>(new String[]{"new", "test", "of", "sort", "this", "algo", "always", "difficult", "i", "think"},new int[] {7,4,2,1});
		strArray.sort();
		strArray.print();*/
	}

}
