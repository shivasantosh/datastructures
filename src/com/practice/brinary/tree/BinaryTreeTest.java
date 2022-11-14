package com.practice.brinary.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insertNode(1);
		tree.insertNode(2);
		tree.insertNode(3);
		tree.insertNode(4);
		tree.insertNode(5);
		
		tree.levelOrder(tree.root);
		System.out.println(tree.getDeepestNode().value);
		tree.deleteDeepestNode();
		System.out.println();
		tree.levelOrder(tree.root);
		tree.deleteNode(1);
		System.out.println();
		tree.levelOrder(tree.root);
		
	}

}
