package com.example.algo1.sort;

import java.util.Arrays;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class SortAlgo {

	public int[] arr;
	
	public abstract void sort();
	
	public void print() {
		log.info(Arrays.toString(arr));
	}
	
	public SortAlgo(int size){
		Random rand = new Random();
		arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = rand.nextInt();
		}
		log.info(Arrays.toString(arr));
	}
	public SortAlgo(int[] givenArr){
		this.arr=givenArr;
	}
	public void exchange(int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		log.info(Arrays.toString(arr));
	}
	
	int compare(int i, int j) {
		if( arr[i]<arr[j]) return -1;
		else if (arr[i]>arr[j]) return 1;
		else return 0;
		
	}
}
