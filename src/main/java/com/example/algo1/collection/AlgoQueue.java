package com.example.algo1.collection;

public class AlgoQueue extends AlgoCollection {
	int headPtr;
	int tailPtr;
	
	@Override
	public void push(String str) {
		if(tailPtr == arr.length) {
			arr = copyQueue();
		}
		arr[tailPtr]=str;
		tailPtr++;
		size++;
		
	}

	@Override
	public String pop() {
		if(isEmpty()) {
			return null;
		}
		String val = arr[headPtr];
		arr[headPtr] = null;
		headPtr++;
		size--;
		return val;
	}

	public String[] copyQueue() {
		String [] temp = new String[arr.length*2];
		int j=0;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]!=null) {
				temp[j]=arr[i];
				j++;
			}
		}
		size = j;
		headPtr=0;
		tailPtr=j;
		return temp;
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
