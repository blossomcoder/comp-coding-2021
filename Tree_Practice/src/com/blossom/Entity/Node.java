package com.blossom.Entity;

public class Node {
	
	public Node left;
	public Node right;
	public int key;
	
	public Node() { }
	
	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	

}
