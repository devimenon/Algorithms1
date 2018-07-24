package com.coursera.algo1.connectivity;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author devi
 *
 */

public class DynamicConnectivityMap implements DynamicConnectable {

	private Map<Integer, Integer> spread; 
	
	DynamicConnectivityMap(Map<Integer, Integer> spread){
		this.spread=spread;
	}
	
	DynamicConnectivityMap(){
		//Integer i=1;
		//Supplier<Integer> supplier = () -> i++; 
		//this.spread=
				//Stream.generate(supplier).limit(10).collect(Collectors.toList()).collect(Collectors.toMap(keyMapper, valueMapper));//.collect(Collectors.toMap(i,i));
	}
	
	@Override
	public boolean isConnected(int a, int b) {
		
		return spread.get(a).compareTo(spread.get(b)) == 0;
	}

	@Override
	public void union(int a, int b) {
		Integer newval=spread.get(a);
		Integer olval=spread.get(b);
		if(!isConnected(a,b)){
			spread.forEach((k,v)->{
				if(v.equals(olval))
					spread.put(k, newval);
			});
		}

	}

	@Override
	public void print() {
		spread.forEach((k,v) -> {
			System.out.println(k +", "+ v);
		});
	}

}
