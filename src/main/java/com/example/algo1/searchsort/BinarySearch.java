package com.example.algo1.searchsort;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
	
	// sorted array
	int[] arr;
	public BinarySearch(int[] arr) {
		this.arr=arr;
	}
	
	//find position of value in the array
	public int findBybinarySearch(int val) {
		return find1(val, 0, arr.length-1);
	}
	
	public int find(int val, int lo, int hi) {
		
		if(arr[lo] == val) return lo;
		if(arr[hi] == val) return hi;
		if((lo==hi || (hi-lo == 1))&& arr[lo] != val)
			throw new IllegalArgumentException(val + " Val not found");
		int mid = (lo+hi)/2;
		if(arr[mid] > val)
			return find(val, lo, mid);
		else
			return find(val,mid,hi);
		
	}
	
	public int find1(int val, int lo, int hi) {
		if(lo > hi) return -1;
				
		int mid = lo + (hi-lo)/2;
		if(arr[mid]>val) return find1(val, lo, mid-1);
		else if (arr[mid]<val) return find1(val, mid+1, hi);
		else return mid; 
			
	}
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	public void print() {
		log.info(toString());
	}
	
	

}
