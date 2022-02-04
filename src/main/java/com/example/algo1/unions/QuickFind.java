package com.example.algo1.unions;

import java.util.Arrays;

//dynamic connectivity problem. find if 2 point are connected.
// quick find
public class QuickFind extends FindAlgo{

	public QuickFind(int n) {
		super(n);
	}

	public boolean connected(int p, int q) {
		return arr[p] == arr[q];
	}
	
	public void union(int p, int q) {
		int val1 = arr[p];
		int val2 = arr[q];
		
		if(val1 != val2) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==val2) arr[i] = val1;
			}
		}
	}
	
}
