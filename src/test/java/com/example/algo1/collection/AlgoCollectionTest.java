package com.example.algo1.collection;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlgoCollectionTest {

	@Test
	public void stackTest() {
		AlgoStack stack = new AlgoStack();
		log.info("size: {}", stack.size());
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("new");
		stack.print();
		log.info("size: {}, pop: {}, size: {}", stack.size(), 
				stack.pop(), stack.size());
		stack.print();
		stack.push("String");
		stack.print();
	}
	
	@Test
	public void queueTest() {
		AlgoQueue q = new AlgoQueue();
		q.print();
		log.info("size: {}", q.size());
		q.push("This");
		q.push("is");
		q.push("a");
		q.push("new");
		q.print();
		log.info("size: {}, pop: {}, size: {}", q.size(), 
				q.pop(), q.size());
		q.print();
		q.push("String");
		q.print();
		q.push("word");
		q.push("again");
		q.print();
	}
}
