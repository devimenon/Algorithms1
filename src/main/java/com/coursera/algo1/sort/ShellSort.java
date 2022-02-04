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
			System.out.println("sort: "+step);
			sort(step);
		}
			
	}
	
	void sort(int step){
		for(int i = 0; i< arr.length;i++){
			for(int j=i+step;(j > 0 && 0 <= j-step && j < arr.length);j-=step){
				if(less(arr[j],arr[j-step])){
					exchange(j,j-step);	
					print();
				}
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ShellSort<Character> chrArray = new ShellSort<Character> (new Character[] {'m','o','l','e','e','x','a','s','p','r','t'},new int[] {3,1});
		//chrArray.sort();
		//chrArray.print();
		
		//chrArray = new ShellSort<Character> (new Character[] {'s','h','e','l','l','s','o','r','t','e','x','a','m','p','l','e'}, new int[]{13,4,1});
		chrArray.sort();
		chrArray.print();
	}

}
