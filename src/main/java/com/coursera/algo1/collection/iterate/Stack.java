package com.coursera.algo1.collection.iterate;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> , Collection<T> {

	Node<T> first = null;		
	
	class ListIterator<S> implements Iterator<T>{
		
		Node<T> current=first;
		
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public T next() {
			T item = current.item;
			current = current.next;
			return item;
		}
		
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public void add(T item) {
		
		Node<T> newItem  = new Node<T>(item);
		if(isEmpty())
			first=newItem;
		else{
			newItem.next=first;
			first=newItem;
		}
		
	}

	@Override
	public T remove() throws Exception {
		T val = first.item;
		first=first.next;
		return val;
	}

	@Override
	public void print() {
		
		
	}

	@Override
	public void printReverse() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>();
	}
	
	
	/*public Iterator<T> reverseIterator(){
		
	}*/

	public static void main(String[] args) throws Exception {
		Stack<String> st = new Stack<String>();
		st.add("new");
		st.add("stack");
		st.add("test");
		for(String str: st){
			System.out.print(str + " ");
		}
			
		System.out.println("\n"+st.remove());
		for(String str: st){
			System.out.print(str + " ");
		}
	}

}
