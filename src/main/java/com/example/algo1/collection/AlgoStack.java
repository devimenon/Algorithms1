package com.example.algo1.collection;

public class AlgoStack extends AlgoCollection {

	@Override
	public void push(String str) {
		
		arr[size]=str;
		size++;
		if(size == arr.length) {
			arr = copy();
		}
	}

	@Override
	public String pop() {
		String val = arr[--size];
		arr[size] = null;
		return val;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

}
