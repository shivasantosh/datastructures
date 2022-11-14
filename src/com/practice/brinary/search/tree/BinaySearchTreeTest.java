package com.practice.brinary.search.tree;

public class BinaySearchTreeTest {

	public static void main(String []args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.insertNode(70);
		binarySearchTree.insertNode(50);
		binarySearchTree.insertNode(60);
		binarySearchTree.insertNode(30);
		binarySearchTree.insertNode(90);
		binarySearchTree.insertNode(80);
		binarySearchTree.insertNode(100);
		binarySearchTree.preOrderTraversal(binarySearchTree.root);
		binarySearchTree.searchOrderTransversal(binarySearchTree.root, 9);
		binarySearchTree.deleteNode(binarySearchTree.root, 50);
		binarySearchTree.preOrderTraversal(binarySearchTree.root);
	}
}
