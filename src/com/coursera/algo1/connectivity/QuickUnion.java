package com.coursera.algo1.connectivity;

public class QuickUnion implements DynamicConnectable {
	
	Integer[] arr;
	int size;
	
	QuickUnion(){
		this(5);
	}
	
	QuickUnion(int size){
		arr = new Integer [size];
		for(int i=0; i<size; i++){
			arr[i]=i;
		}
		this.size=size;
	}

	@Override
	public boolean isConnected(int a, int b) {
		return findRoot(a) == findRoot(b);
	}

	@Override
	public void union(int a, int b) {
		System.out.println("union - "+a +", "+b);
		if(a >=size || b >= size)
			throw new ArrayIndexOutOfBoundsException("Union for val a="+ a+", b="+b+" greater than size "+size);
		if(isConnected(a, b)){
			System.out.println("a="+ a+", b="+b+" already connected");
			return;
		}	
		
		int pos = findRoot(a);
		arr[b]=pos;
	}
	
	int findRoot(int a){
		if(arr[a] == a)
			return a;
		else {
			//return arr[a]=findRoot(arr[a]); // does this work as path compression??
			return findRoot(arr[a]);
			
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
		QuickUnion qu = new QuickUnion(20);
		qu.print();
		qu.union(4, 5);
		qu.print();
		qu.union(5, 0);
		qu.print();
		System.out.println(qu.isConnected(1, 0));
		qu.union(0, 4);
		qu.print();
		qu.union(8, 9);
		qu.print();
		
	}

}
