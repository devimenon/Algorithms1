package com.example.algo1.collection;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AlgoCollection implements AlgoCollPntr{

	protected int size = 0;
	protected String[] arr;
	
	AlgoCollection() {
		arr = new String[3];
	}
	
	protected String[] copy() {
		String [] temp = new String[arr.length*2];
		for(int i = 0; i <arr.length; i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	public void print() {
		log.info(toString());
	}
}
