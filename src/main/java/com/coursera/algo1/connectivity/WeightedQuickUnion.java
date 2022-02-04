package com.coursera.algo1.connectivity;

public class WeightedQuickUnion extends QuickUnion{
	WeightedQuickUnion(int size){
		super(size);
		weight=new int[size];
		for(int i=0; i<size;i++)
			weight[i]=1;
	}
	WeightedQuickUnion(){
		this(7);
	}

	int[] weight;

	@Override
	public void union(int a, int b) {
		System.out.println("union - "+a +", "+b);
		if(a >=size || b >= size)
			throw new ArrayIndexOutOfBoundsException("Union for val a="+ a+", b="+b+" greater than size "+size);
		int pos=findRoot(a);
		int posb=findRoot(b);
		if(pos == posb){
			System.out.println("a="+ a+", b="+b+" already connected");
			return;
		}


		if(weight[pos]>=weight[posb]){			
			arr[b]=pos;
			weight[pos]=weight[pos]+1;
		}else{
			arr[a]=posb;
			weight[posb]=weight[posb]+1;
		}

	}

	@Override
	public void print() {
		super.print();
		for(int a: weight){
			System.out.print(a+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		WeightedQuickUnion qu = new WeightedQuickUnion(10);
		qu.print();
		qu.union(2, 3);
		qu.print();
		qu.union(4, 6);
		qu.print();
		qu.union(7, 6);
		qu.print();
		qu.union(6, 5);
		qu.print();
	}

}


