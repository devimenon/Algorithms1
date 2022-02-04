package com.example.algo1.collection;

public class Node {

	String str;
	Node node;
	
	public String print() {
		
		return str + " " + ((node == null) ? "" : node.print()); 
	}

	@Override
	public String toString() {
		return print();
	}
}
