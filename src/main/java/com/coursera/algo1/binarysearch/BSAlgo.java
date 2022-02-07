package com.coursera.algo1.binarysearch;

import java.util.Random;

public class BSAlgo {

	Integer [] arr;
	Random rand = new Random();
	int size;
	BSAlgo (Integer [] arf){
		this.arr=arf;
		this.size=arf.length;
	}
	

	void print() {
		System.out.println();
		for(int i: arr){
			System.out.print(i + " ");
		}
		
	}
	int search(int a){
		return find(a, 0, size-1);
	}
	int find(int a, int low, int high){
		System.out.println(low+" -- "+high);
		/*if(low == high)
			if( arr[low] == a)
				return low;
			else
				return -1;*///throw new Exception ("No such number");	
		int mid = (low+high)/2;
		if (arr[mid] == a)
			return mid;
		else if( arr[mid] < a)
 			return find(a, mid+1, high);
		else 
			return find (a, low, mid-1);
			
	}

	public static void main(String[] args) {
		BSAlgo bs = new BSAlgo(new Integer[]{1,5,12,15,17,19,20,24,27,28,30,35, 37, 39, 40, 54} );
		//bs.print();
		System.out.println(bs.search(20));
	}
	
	

}
