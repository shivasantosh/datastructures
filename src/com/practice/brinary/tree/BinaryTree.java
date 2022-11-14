package com.practice.brinary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	public void preOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.value);
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}

	public void inOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		preOrderTraverse(node.left);
		System.out.println(node.value);
		preOrderTraverse(node.right);
	}

	public void postOrderTraverse(Node node) {
		if (node == null) {
			System.out.println("There are no values print");
			return;
		}
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
		System.out.println(node.value);
	}

	public void levelOrder(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.remove();
			System.out.print(tempNode.value+" ");
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	public void insertNode(int value) {
		Node newNode = new Node(value);
		if (this.root == null) {
			this.root = newNode;
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			if (node.left == null) {
				node.left = newNode;
				return;
			} else if (node.right == null) {
				node.right = newNode;
				return;
			} else {
				queue.add(node.left);
				queue.add(node.right);
			}
		}
	}

	public Node getDeepestNode() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Node presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		return presentNode;
	}

	public void deleteDeepestNode() {
		if (this.root == null) {
			System.out.println("No values present");
			return;
		}
		Node presentNode = null;
		Node previousNode = null;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if (presentNode.left == null) {
				previousNode.right = null;
				return;
			}
			if (presentNode.right == null) {
				presentNode.left = null;
				return;
			}
			queue.add(presentNode.left);
			queue.add(presentNode.right);

		}
	}
	
	public void deleteNode(int value) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node  = queue.remove();
			if(node.value == value) {
				Node deepestNode = getDeepestNode();
				node.value = deepestNode.value;
				deleteDeepestNode();
				return;
			}
			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
			
		}
	}
}
