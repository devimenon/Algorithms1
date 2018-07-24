package com.coursera.algo1.collection;

public class StackArray implements Collection{

	String[] arr;
	int pos;
	
	StackArray(){
		arr = new String[10];
		pos = 0; 
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pos == 0;
	}

	@Override
	public void add(String str) {
		// TODO Auto-generated method stub
		arr[pos]=str;
		pos+=1;
		
	}

	@Override
	public void remove(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		pos=(pos==0)?0:pos-1;
		String val = arr[pos];
		arr[pos]=null;
		
		return val;
	}

	@Override
	public void print() {
		for(String str:arr){
			System.out.print((str==null)?"":str+" ");
		}
		System.out.println();
	}

	@Override
	public void printReverse() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		StackArray sa = new StackArray();
		sa.add("this");
		sa.add("is");
		sa.add("a");
		sa.add("stack");
		sa.add("array");
		sa.remove();
		sa.print();
	}
}
