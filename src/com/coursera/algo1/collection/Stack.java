package com.coursera.algo1.collection;

public class Stack implements Collection {
	Node node;
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return node == null;
	}

	@Override
	public void add(String str) {
		// TODO Auto-generated method stub
		if(isEmpty()){
			node = new Node(str);
		}else{
			Node n = new Node(str);
			n.node = this.node;
			this.node=n;
		}
		
	}

	@Override
	public void remove(String str) {
		// TODO Auto-generated method stub
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		String val = this.node.str;
		this.node = this.node.node;
		return val;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(print(this.node));
	}
	
	String print(Node node){
		if(node == null)
			return "";
		return node.str + " "+print(node.node);
		
	}
	
	@Override
	public void printReverse() {
		// TODO Auto-generated method stub
		System.out.println(reverse(this.node));
	}
	
	String reverse(Node node){
		if(node == null)
			return "";
		return reverse(node.node)+" "+node.str;
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.add("this");
		st.add("is");
		st.add("a");
		st.add("stack");
		//st.remove();
		System.out.println(st.isEmpty());
		st.print();
		st.printReverse();
	}

	

}




