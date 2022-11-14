package com.practice.brinary.search.tree;

public class BinarySearchTree {

	public Node root;

	public void insertNode(int value) {
		if (this.root == null) {
			this.root = new Node(value);
			return;
		}
		insertNode(root, value);
	}

	public void insertNode(Node node, int value) {
		if (value > node.value) {
			if (node.right == null) {
				node.right = new Node(value);
				return;
			}
			insertNode(node.right, value);
		} else if (value < node.value) {
			if (node.left == null) {
				node.left = new Node(value);
				return;
			}
			insertNode(node.left, value);
		}

	}

	public void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void searchOrderTransversal(Node node, int value) {
		if (node.value == value) {
			System.out.println();
			System.out.println("element found" + value);
			return;
		} else if (value > node.value) {
			if (node.right == null) {
				System.out.println();
				System.out.println("No element found in right");
				return;
			}
			searchOrderTransversal(node.right, value);
		} else if (value <= node.value) {
			if (node.left == null) {
				System.out.println();
				System.out.println("No element found in left");
				return;
			}
			searchOrderTransversal(node.left, value);
		}
	}

	public Node getMinimalNode(Node node) {
		if (node.left != null) {
			return getMinimalNode(node.left);
		}
		return node;
	}

	public Node deleteNode(Node node,int value) {
		if(value < node.value) {
			node.left = deleteNode(node.left, value);
		}else if(value > node.value) {
			node.right = deleteNode(node.right, value);
		}else {
			if(node.left != null  && node.right != null) {
				Node tempNode = getMinimalNode(node.right);
				node.value = tempNode.value;
				node.right =  deleteNode(node.right, tempNode.value);
			}else if(node.left != null) {
				node = node.left;
			}else if(node.right !=null) {
				node = node.right;
			}else {
				node =null;
			}
		}
		return node;
	}
}
