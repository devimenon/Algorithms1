package com.coursera.algo1.collection;

public interface Collection {

	boolean isEmpty();
	
	void add(String str);
	
	void remove(String str);
	
	String remove() throws Exception;
	
	void print();
	
	void printReverse();
}
