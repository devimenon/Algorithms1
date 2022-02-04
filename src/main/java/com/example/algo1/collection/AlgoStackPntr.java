package com.example.algo1.collection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlgoStackPntr implements AlgoCollPntr {

	Node node;
	private int size = 0;
	
	@Override
	public void push(String str) {
		Node tmp = node;
		node = new Node();
		node.str = str;
		node.node = tmp;
		size++;
	}
	@Override
	public String pop() {
		if(isEmpty())
			return null;
		String val = node.str;
		node = node.node;
		size--;
		return val;
	}

	@Override
	public boolean isEmpty() {
		return node == null;
	}

	@Override
	public int size() {
		return size;
	}
	
	public void print() {
		log.info("Node: {}, size: {}", node, size);
	}

}
