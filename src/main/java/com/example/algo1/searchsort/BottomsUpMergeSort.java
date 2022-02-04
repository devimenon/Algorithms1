package com.example.algo1.searchsort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BottomsUpMergeSort extends SortAlgoGeneric<String>{

	BottomsUpMergeSort(String[] givenArr) {
		super(givenArr);
	}
	
	//works as in algo video
	void merge(String[] a, String[] aux, int lo, int mid, int hi) {
		for(int i=lo;i<=hi;i++) {
			aux[i]=a[i];
		}
		int i = lo, j = mid+1; 
		print();
		for(int k = lo; k<=hi;k++) {
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(compare(aux,i,j)<=0) a[k]=aux[i++];
			else a[k]=aux[j++];
		}
	}

	void sort() {
		String[] aux = new String[arr.length];
		for(int i = 1; i< arr.length; i=i*2) {
			for(int j=0;j<arr.length;j+=i) {
				
				//merge(arr,aux,j,)
			}
		}
	}

}
