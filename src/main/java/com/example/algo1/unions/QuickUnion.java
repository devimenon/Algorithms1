package com.example.algo1.unions;

public class QuickUnion extends FindAlgo{

	public QuickUnion(int n) {
		super(n);
	}

	@Override
	public boolean connected(int p, int q) {
		return findRoot(p) == findRoot(q);
	}

	@Override
	public void union(int p, int q) {
		
		int r1 = findRoot(p);
		int r2 = findRoot(q);
		
		if(r1!=r2) arr[r1] = q;
		
		
	}
	
	public int findRoot(int i) {
		if(arr[i] == i) {
			return i;
		} 
		return findRoot(arr[i]);
		
	}

}
