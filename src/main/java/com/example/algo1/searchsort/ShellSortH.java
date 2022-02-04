package com.example.algo1.searchsort;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShellSortH{
	String[] arrStr;
	
	ShellSortH(String[] arrStr) {
		this.arrStr = arrStr;
		
	}
	
	void sort() {
		/*int len = arrStr.length/2;
		while(len > 0) {
			log.info("h increment: {}", len);
			sort(len);
			len=len/2;
		}*/
		log.info("h increment: {}", 7);sort(7);
		log.info("h increment: {}", 3);sort(3);
		log.info("h increment: {}", 1);sort(1);
	}
	void sort(int h) {

		for(int i = 0; i<arrStr.length;i++) {
			
			for(int j = i+h;j >0 && j<arrStr.length;j-=h) {
				if(j-h >= 0 && compare(j-h,j)>0) {
					exchange(j-h, j);
				} else {
					break;
				}
				
			}
		}
	}
	void exchange(int i, int j) {
		String temp=arrStr[i];
		arrStr[i]=arrStr[j];
		arrStr[j]=temp;
		log.info(Arrays.toString(arrStr));
	}
	
	int compare(int i, int j) {
		return arrStr[i].compareTo(arrStr[j]) ;
		
	}
	void print() {
		log.info(Arrays.toString(arrStr));
	}

}
