package com.blossom.TreeOperations;

import com.blossom.Entity.Node;
import com.blossom.Entity.BinarySearchTree;

public class Search {
	
	public static Node searchKey(Node root, int key) {
		if(root == null || root.key == key)
			return root;
		
		if(key > root.key)
			return searchKey(root.right, key);
		else
			return searchKey(root.left, key);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(8);
		tree.insert(3);
		tree.insert(10);
		tree.insert(1);
		tree.insert(6);
		tree.insert(4);
		tree.insert(7);
		tree.insert(14);
		tree.insert(13);
		
		System.out.println(searchKey(tree.root, 6).key);

	}

}
