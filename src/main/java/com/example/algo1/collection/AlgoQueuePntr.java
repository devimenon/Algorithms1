package com.example.algo1.collection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlgoQueuePntr implements AlgoCollPntr {

	Node node;
	private int size = 0;

	Node next;
	
	public void push(String str) {
		Node tmp = new Node();
		tmp.str=str;
		if(isEmpty()) {
			node = tmp;
		} else {
			next.node = tmp;
		}
		next = tmp;
		size++;
		
	}
	
	/*@Override
	public void push(String str) {
		if(isEmpty()) {
			node = new Node();
			node.str=str;
			next = node;
		} else {
			Node tmp = new Node();
			tmp.str=str;
			next.node = tmp;
			next = tmp;
		}
		size++;
		
	}*/

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
