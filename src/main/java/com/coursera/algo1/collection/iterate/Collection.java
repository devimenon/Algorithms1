package com.coursera.algo1.collection.iterate;

public interface Collection<T> {

boolean isEmpty();
	
	void add(T str);
	
	T remove() throws Exception;
	
	void print();
	
	void printReverse();
}
