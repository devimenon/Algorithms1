package com.example.algo1.unions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.algo1.unions.QuickFind;
import com.example.algo1.unions.QuickUnion;
import com.example.algo1.unions.WQUPC;
import com.example.algo1.unions.WeightedQuickUnion;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class QuickUnionFindTest {

private QuickFind qf;
private QuickUnion qu;
private WeightedQuickUnion qwu;
private WQUPC pc;
	
	@BeforeEach
	public void init() {
		qf = new QuickFind(10);
		qu = new QuickUnion(10);
		qwu = new WeightedQuickUnion(10);
		pc = new WQUPC(10);
	}
	
	@Test
	public void test1() {
		// 0, 2, 2, 3, 4, 0, 6, 2, 8, 0
		
		qf.union(1,2);
		qf.union(2,7);
		qf.print();
		log.info("1,7: {}",qf.connected(1, 7));
		qf.union(0, 5);
		qf.union(0, 9);
		qf.print();
		log.info("5,9: {}",qf.connected(5, 9));
		log.info("0,7: {}",qf.connected(0, 7));
		qf.union(0, 7);
		qf.print();
		log.info("0,1: {}",qf.connected(0, 1));
		assertTrue(qf.connected(0, 1));
	}
	
	@Test
	public void test2() {
		qu.print();
		qu.union(1,2);
		qu.print();
		qu.union(2,7);
		qu.print();
		log.info("1,7: {}",qu.connected(1, 7));
		qu.union(0, 5);
		qu.print();
		qu.union(0, 9);
		qu.print();
		log.info("5,9: {}",qu.connected(5, 9));
		log.info("0,7: {}",qu.connected(0, 7));
		qu.union(0, 7);
		qu.print();
		log.info("0,1: {}",qu.connected(0, 1));
		assertTrue(qu.connected(0, 1));
		
	}
	
	@Test
	public void test3() {
		qwu.print();
		qwu.union(1,2);
		qwu.print();
		qwu.union(2,7);
		qwu.print();
		log.info("1,7: {}",qwu.connected(1, 7));
		qwu.union(0, 5);
		qwu.print();
		qwu.union(0, 9);
		qwu.print();
		log.info("5,9: {}",qwu.connected(5, 9));
		log.info("0,7: {}",qwu.connected(0, 7));
		qwu.union(0, 7);
		qwu.print();
		log.info("0,1: {}",qwu.connected(0, 1));
		assertTrue(qwu.connected(0, 1));
		
	}
	
	@Test
	public void test4() {
		pc.print();
		pc.union(1,2);
		pc.print();
		pc.union(2,7);
		pc.print();
		log.info("1,7: {}",pc.connected(1, 7));
		pc.union(0, 5);
		pc.print();
		pc.union(0, 9);
		pc.print();
		log.info("5,9: {}",pc.connected(5, 9));
		log.info("0,7: {}",pc.connected(0, 7));
		pc.union(0, 7);
		pc.print();
		log.info("0,1: {}",pc.connected(0, 1));
		assertTrue(pc.connected(0, 1));
		
		System.out.println(pc.findRoot(9));
		pc.print();
		
	}
}
