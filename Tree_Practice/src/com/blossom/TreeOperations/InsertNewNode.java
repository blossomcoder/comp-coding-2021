package com.blossom.TreeOperations;

import com.blossom.Entity.BinarySearchTree;
import com.blossom.Entity.Node;

public class InsertNewNode {

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
		
		System.out.println(insertNew(tree.root, 20));
		System.out.println(Search.searchKey(tree.root, 20).key);

	}
	
	public static Node insertNew(Node root, int key) {
		if(root == null){
			return new Node(key);
		}
		
		if(key > root.key) {
			root.right = insertNew(root.right, key);
		} else {
			root.left = insertNew(root.left, key);
		}
		return root;
	}

}
