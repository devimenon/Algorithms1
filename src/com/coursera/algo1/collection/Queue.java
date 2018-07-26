package com.coursera.algo1.collection;

public class Queue implements Collection {
	Node node;
	Node ptr;
	
	@Override
	public boolean isEmpty() {
		return node == null;
	}

	@Override
	public void add(String str) {
		if(isEmpty()){
			this.node = new Node(str);
			ptr = this.node;
		}else{
			//Node tail = findTail(this.node);
			//tail.node=new Node(str);
			Node tail = new Node(str);
			ptr.node = tail;
			ptr = tail;
		}
	}
	
	Node findTail(Node curr){
		
		if(curr.node == null)
			return curr;
		else
			return findTail(curr.node);
	}

	@Override
	public void remove(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public String remove() throws Exception{
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new Exception ("No string to remove");
		String val = node.str;
		this.node = node.node;
		return val;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(print(this.node));
	}
	
	String print(Node node){
		if(node == null)
			return " ";
		return node.str + " "+print(node.node); 
	}

	@Override
	public void printReverse() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) throws Exception {
		Queue q=new Queue();
		q.print();
		//q.remove();
		q.add("this");
		q.add("is");
		q.add("new");
		q.print();
		q.remove();
		q.print();
		
	}

}
