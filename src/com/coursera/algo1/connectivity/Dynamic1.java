package com.coursera.algo1.connectivity;

public class Dynamic1 implements DynamicConnectable{
	
	private Integer[] arr;
	private int size = 5;
	
	public Dynamic1(int size){
		arr = new Integer[size];
		for(int i=0; i<size;i++){			
			arr[i] = i;			
		}		
	}
	
	public Dynamic1(){		
		this(5);
	}

	@Override
	public boolean isConnected(int a, int b) {
		return (arr[a]==arr[b]);
				
	}

	@Override
	public void union(int a, int b) {
		if(!isConnected(a,b)){
			Integer val = arr[a];
			arr[a] = arr[b];
			for(int j=0; j<size; j++ ){
				if(arr[j]==val) arr[j] = arr[b];
			}
		}			
	}

	@Override
	public void print() {
		
		for(int i: arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		Dynamic1 dy1 = new Dynamic1();
		dy1.union(0,1);
		dy1.print();
		dy1.union(1, 2);
		System.out.println(dy1.isConnected(0, 2));
		dy1.print();
		dy1.union(3, 4);
		dy1.print();
	}
}
