package com.coursera.algo1.connectivity;

public class Dynamic1 implements DynamicConnectable{
	
	private Integer[] maze;
	private int size = 5;
	
	public Dynamic1(int size){
		maze = new Integer[size];
		for(int i=0; i<size;i++){			
			maze[i] = i;			
		}		
	}
	
	public Dynamic1(){		
		this(5);
	}

	@Override
	public boolean isConnected(int a, int b) {
		return (maze[a]==maze[b]);
				
	}

	@Override
	public void union(int a, int b) {
		if(!isConnected(a,b)){
			Integer val = maze[a];
			maze[a] = maze[b];
			for(int j=0; j<size; j++ ){
				if(maze[j]==val) maze[j]= maze[b];
			}
		}			
	}

	@Override
	public void print() {
		
		for(int i: maze){
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
