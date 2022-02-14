package com.example.algo1.searchsort;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.algo1.sort.BinarySearch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchSortTest {

	BinarySearch bs;
	int[] arr = new int[] {12,14,25,27,28,30,35,37,44,49,50,70,75,78,83,86};
	@BeforeEach
	void init(){
		bs = new BinarySearch(arr);
		log.info("size: {}", arr.length);
	}
	
	
	@Test
	void test2() throws Exception {
		bs.print();
		log.info("30: {}",bs.findBybinarySearch(30));
		assertTrue( 5 == bs.findBybinarySearch(30), "30 is at 5");
		log.info("12: {}",bs.findBybinarySearch(12));
		assertTrue( 0 == bs.findBybinarySearch(12), "12 is at 0");
		log.info("86: {}",bs.findBybinarySearch(86));
		assertTrue( 15 == bs.findBybinarySearch(86), "86 is at 15");
		log.info("37: {}",bs.findBybinarySearch(37));
		assertTrue( 7 == bs.findBybinarySearch(37), "37 is at 7");
		log.info("44: {}",bs.findBybinarySearch(44));
		assertTrue( 8 == bs.findBybinarySearch(44), "44 is at 8");
		
		/*Assertions
		.assertThrows(IllegalArgumentException.class, () -> {
			bs.findBybinarySearch(45);
		}, "IllegalArgumentException error was expected for search 45");

		Assertions
		.assertThrows(IllegalArgumentException.class, () -> {
			bs.findBybinarySearch(90);
		}, "IllegalArgumentException error was expected for search 90");*/

		assertTrue( -1 == bs.findBybinarySearch(45), "44 is at -1, not found");
		assertTrue( -1 == bs.findBybinarySearch(90), "90 is at -1, not found");
		int[] arr = new int[] {0,3,4,5,7,12,13,16,20}; 
		bs = new BinarySearch(arr); 
		bs.print(); 
		log.info("0: {}",bs.findBybinarySearch(0)); 
		assertTrue( 0 == bs.findBybinarySearch(0), "0 is at 0");
		log.info("20: {}",bs.findBybinarySearch(20)); 
		assertTrue( 8 == bs.findBybinarySearch(20), "20 is at 8");
		log.info("7: {}",bs.findBybinarySearch(7)); 
		assertTrue( 4 == bs.findBybinarySearch(7), "7 is at 4");
		log.info("12: {}",bs.findBybinarySearch(12)); 
		assertTrue( 5 == bs.findBybinarySearch(12), "12 is at 5");
	}
	
	
}
