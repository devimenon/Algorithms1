package com.example.algo1.unions;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeightedQuickUnion extends QuickUnion{

	int[] sz;
	public WeightedQuickUnion(int n) {
		super(n);
		
		sz=new int[n];
		for(int i=0; i<n;i++) {
			sz[i]=1;
		}
	}
	
	@Override
	public void union(int p, int q) {
		int r1 = findRoot(p);
		int r2 = findRoot(q);
		if(r1==r2) return;
		if(sz[r1]>sz[r2]) {
			// always move the root of smaller to bigger
			arr[r2]=r1;
			sz[r1]+=sz[r2];
			//sz[q]=0;
		} else {
			arr[r1]=r2;
			sz[r2]+=sz[r1];
			//sz[p]=0;
		}
		
		log.info(Arrays.toString(sz));
	}

}

