package com.blossom.Entity;
public class BinarySearchTree {
	
	public Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int key) {
		
		Node newNode = new Node(key);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true) {  
			parent = current;
			if(key < current.key) { 
				current = current.left;
				if(current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if(current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
		
	}

}
