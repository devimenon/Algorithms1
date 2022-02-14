package com.example.algo1.bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	Node root;
	
	//from video, works
	void putVid(String key, Integer value) {
		root = putVid(root, new Node(key,value));
	}
	
	Node putVid(Node x, Node newNode) {
		if(x==null) x = newNode;
		int cmpt = x.compareTo(newNode);
		if(cmpt>0) x.left = putVid(x.left,newNode);
		else if(cmpt<0) x.right = putVid(x.right,newNode);
		else x.val = newNode.val;
		x.count = 1+size(x.left)+size(x.right);
		return x;
	}
	
	int size() {
		return size(root);
	}
	
	int size(Node nd) {
		if(nd==null) return 0;
		return nd.count;
	}
	
	Node search(String key) {
		return search(root, key);
	}

	Node search(Node nd, String key) {
		if(nd == null) return null;
		int cmp = nd.key.compareTo(key);
		if(cmp<0) return search (nd.right,key);
		else if(cmp>0) return search (nd.left,key);
		else return nd;
	}

	void delete(String key) {
		delete(root, key);
	}
	
	Node delete(Node nd, String key) {
		if(nd==null) return nd;
		int cmp = nd.key.compareTo(key);
		if(cmp<0) nd.right =  delete(nd.right,key);
		else if (cmp > 0) nd.left = delete(nd.left, key);
		else {
			if(nd.left == null ) return nd.right;
			if(nd.right == null) return nd.left;
			//hibbard's deletion
			Node t = nd;
			nd = getMin(t.right);
			nd.right = delMin(t.right);
			nd.left = t.left;
		}
		nd.count = 1 + size(nd.left)+size(nd.right);
		return nd;
	}

	Iterable<String> iterator(){
		List<String> q = new ArrayList<String>();
		
		inorder(root,q);
		return q;
	};
	
	void inorder(Node nd, List<String> q) {
		if(nd==null) return;
		inorder(nd.right,q);
		q.add(nd.key);
		inorder(nd.left,q);
	}
	
	Node getMin(Node nd) {
		
		if(nd.left!=null)  
			return getMin(nd.left);
		else return nd;
	}
	
	Node delMin(Node nd) {
		if(nd.left==null) return nd.right;
		nd.left = delMin(nd.left);
		nd.count=1+size(nd.right)+size(nd.left);
		return nd;
		
	}
	
	
	Node delMax(Node nd) {
		if(nd.right==null) return nd.left;
		nd.right = delMax(nd.right);
		nd.count=1+size(nd.right)+size(nd.left);
		return nd;
		
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.put("G", Integer.valueOf(1));
		bst.put("E", Integer.valueOf(1));
		bst.put("H", Integer.valueOf(1));
		bst.put("R", Integer.valueOf(1));
		bst.put("A", Integer.valueOf(1));
		bst.put("Y", Integer.valueOf(1));
		bst.put("I", Integer.valueOf(1));
		bst.put("N", Integer.valueOf(1));
		Node Y = bst.get("Y");
		Node C = bst.get("C");
		System.out.println((bst.iterator().toString()));
		System.out.println(bst.getMin(bst.root).key);
		System.out.println(bst.delMin(bst.root));
		System.out.println((bst.iterator().toString()));
		System.out.println(bst.delMax(bst.root));
		System.out.println((bst.iterator().toString()));
		bst.delete("I");
		System.out.println((bst.iterator().toString()));
		System.out.println(bst.search("R").key);
		/*bst.insert("G");
		bst.insert("E");
		bst.insert("H");
		bst.insert("R");
		bst.insert("A");
		bst.insert("A");
		bst.insert("I");
		bst.insert("Y");
		bst.insert("A");
		bst.insert("N");
		System.out.println(bst.root.print());*/
	}
	//mine code
		void put(String key ,Integer value) {
			if(root == null) {
				root = new Node(key,value);
				return;
			}
			sink(root, new Node(key,value));
			
		}
		void sink(Node nd, Node newNode) {
			if(nd == newNode) return;
			Node temp;
			if(newNode.compareTo(nd) > 0) {
				nd.right=nd.right==null?newNode:nd.right;
				temp=nd.right;
			} else {
				nd.left=nd.left==null?newNode:nd.left;
				temp=nd.left;
			}
			sink(temp,newNode);
		}
		
		Node get(String key) {
			return get(root,new Node(key,null));
		}
		
		Node get(Node nd, Node node) {
			//if(nd!=null && nd.compareTo(node) == 0) return nd;
			if(nd==null) return null;
			int cmp = nd.compareTo(node);
			if(cmp==0) return nd;
			
			Node tmp = nd.right;
			if(cmp>0) tmp=nd.left;
			
			return get(tmp,node);
		}
}
