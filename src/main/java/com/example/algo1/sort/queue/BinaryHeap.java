package com.example.algo1.sort.queue;

import com.example.algo1.sort.mergenquick.SortAlgoGeneric;

public class BinaryHeap extends SortAlgoGeneric<String>{
	int N = 0;
	public BinaryHeap() {
		super(new String[10]);
	}
	// Children of node k are at 2k and 2k+1
	// parent of a node is at k/2
	public void insert(String str) {
		arr[++N] = str;
		swim(N);
	}
	
	
	public void swim(int k) {
		if(k==1) return;
		if(compare(arr,k,k/2) >0) exchange(arr, k, k/2);
		swim(k/2);
	}
		
	public boolean isEmpty() {
		return N == 0;
	}
	
	
	// from vid
	public void sink(String[] array, int k, int n) {
		if(k>=n) return;
		int j = 2*k;
		if(j < n && compare(array, j+1, j)>0) {
			j++;
		}
		if(j>n) return;
		if(compare(array,j,k)>0) {
			exchange(array, j,k);
			sink(array,j,n);
		}
		
	}
	
	public void sink(int k) {
		if(k>=N) return;
		int j = 2*k;
		if(j < N && compare(arr, j+1, j)>0) {
			j++;
		}
		if(j>N) return;
		if(compare(arr,j,k)>0) {
			exchange(arr, j,k);
			sink(j);
		}
		
	}
	
	public String delMax() {
		String max = arr[1];
		exchange(arr,N,1);
		arr[N--]=null;
		sink(1);
		return max;
	}
	
	public String[] maxHeap(String[] heap) {
		for(int i = heap.length-1; i>1;i--) {
			exchange(heap,1,i);
			sink(heap,1,i-1);
		}
		print(heap);
		return heap;
	}

	public String[] buildHeapVid(String[] array) {
		for(int k=array.length-1/2;k>=1;k--) {
			sink(array,k,array.length-1);
		}
		print(array);
		return array;
	}
	
	public String max() {
		return arr[1];
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		BinaryHeap bs = new BinaryHeap();
		/*bs.insert("G");
		bs.print();
		bs.insert("T");
		bs.insert("A");
		bs.insert("S");
		bs.insert("P");*/
		
		//bs.print(); // TSAGP
		//bs.maxHeap();
		//bs.minHeap();
		String[] array = "SSORTEXAMPLE".split("");
		array[0]=null;
		
		bs.buildHeapVid(array);
		bs.maxHeap(array);
		
	}

	// working but clears the array
		public String[] maxHeap() {
			String[] arrSorted = new String[arr.length];
			int items = N;
			for(int i = 1;i<=items;i++) {
				arrSorted[i]=delMax();
			}
			print(arrSorted);
			return arrSorted;
		}
		
		//mine code
		//given a random array convert to heap order
		// s o r t e x a m p l e
		public void buildHeap(String[] array) {
			//int n = array.length-1;
			
			
			for(int n =array.length-1;n > 0; n-=3) {
				int node = n/2;
				int j = 2*node;
				if(j+1 < array.length && compare(array, j+1, j) > 0) {
					j++;
				}
				if(compare(array,node,j)<0) {
					exchange(array,node,j);
				}
			}
				
			print(array);
			
		}
		
		//mine code
		public void sink1(int k) {
			if(k>=N) return;
			if(2*k < N && compare(arr, 2*k, k)>0) {
				exchange(arr, 2*k,k);
				sink1(2*k);
			}
			if (2*k+1 < N && compare(arr, 2*k+1, k)>0) {
				exchange(arr, 2*k+1,k);
				sink1(2*k+1);
			}
			
		}
		
		
}
