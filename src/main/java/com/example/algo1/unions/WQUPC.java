package com.example.algo1.unions;

import org.springframework.beans.factory.annotation.Autowired;

public class WQUPC extends WeightedQuickUnion{

	public WQUPC(int n) {
		super(n);
	}

	//WeightedQuickUnionPathCompression
	
	@Autowired
	public int findRoot(int i) {
		if(arr[i] == i) {
			return i;
		} 
		arr[i]=arr[arr[i]];
		return findRoot(arr[i]);
		
	}
	
}
