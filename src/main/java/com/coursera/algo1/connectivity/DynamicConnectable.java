package com.coursera.algo1.connectivity;

/**
 * @author devi
 *
 */
public interface DynamicConnectable {

	
	/**
	 * Are two points in the map connected
	 * @param a point a
	 * @param b point b
	 * @return
	 */
	boolean isConnected(int a, int b);
	
	void union(int a, int b);
	
	void print();
}
