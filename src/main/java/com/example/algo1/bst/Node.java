package com.example.algo1.bst;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Node implements Comparable<Node>{
	String key;
	Integer val;
	Node left;
	Node right;
	int count;
	
	public Node(Integer val) {
		super();
		this.val = val;
	}
	

	public Node(String key, Integer val) {
		super();
		this.key = key;
		this.val = val;
	}
	@Override
	public int compareTo(Node o) {
		
		return this.key.compareTo(o.key);
	}

	
	public String print() {
		
		return val + " " + ((left == null) ? "" : left.print()) 
				+" "+((right == null) ? "" : right.print()); 
	}

	@Override
	public String toString() {
		return print();
	}


}
