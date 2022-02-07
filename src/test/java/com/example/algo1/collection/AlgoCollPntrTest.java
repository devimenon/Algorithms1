package com.example.algo1.collection;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AlgoCollPntrTest {
	
	@Test
	public void stackPntrTest() {
		
		AlgoStackPntr stack = new AlgoStackPntr();
		stack.print();
		log.info("stack empty: {}", stack.isEmpty());
		stack.push("is");
		stack.push("this");
		stack.push("truee");
		assertTrue(3 == stack.size());
		stack.print();
		
		assertTrue("truee" == stack.pop());
		assertTrue(2 == stack.size());
		stack.push("fine");
		stack.print();
		assertTrue( "fine".equals(stack.pop()),"pop: fine");
		assertTrue( "this".equals(stack.pop()),"pop: this");
		assertTrue( "is".equals(stack.pop()),"pop: is");
		assertNull(stack.pop());
		stack.print();
		assertNull(stack.pop());
	}

	@Test
	public void queuePntrTest() {
		
		AlgoQueuePntr queue = new AlgoQueuePntr();
		queue.print();
		log.info("queue empty: {}", queue.isEmpty());
		queue.push("is");
		queue.push("this");
		queue.push("truee");
		assertTrue(3 == queue.size());
		queue.print();
		
		assertTrue("is" == queue.pop());
		assertTrue(2 == queue.size());
		queue.push("fine");
		queue.print();
		assertTrue( "this".equals(queue.pop()),"pop: this");
		assertTrue( "truee".equals(queue.pop()),"pop: truee");
		assertTrue( "fine".equals(queue.pop()),"pop: fine");
		assertNull(queue.pop());
		queue.print();
		assertNull(queue.pop());
	}

}
