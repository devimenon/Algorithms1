package com.example.algo1.sort.mergenquick;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSelection extends QuickSort{

	public QuickSelection(String[] givenArr) {
		super(givenArr);
	}


	public String select(int k) {
		
		int lo = 0, hi=arr.length-1;
		
		while(hi>lo) {
			int j = partition(arr, lo, hi);
			if(j > k) hi=j-1;
			else if(j < k) lo=j+1;
			else return arr[k];
		}
		return arr[k];
	}


}
