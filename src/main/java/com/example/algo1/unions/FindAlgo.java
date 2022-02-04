package com.example.algo1.unions;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class FindAlgo {
	int[] arr;
	
	public FindAlgo(int n) {
		// initialize array
		arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = i;
		}
	}
	
	public abstract boolean connected(int p, int q);
	
	public abstract void union(int p, int q);
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	public void print() {
		log.info(toString());
	}
}
