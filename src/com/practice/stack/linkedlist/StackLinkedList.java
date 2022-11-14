package com.practice.stack.linkedlist;

public class StackLinkedList {

	private Node head;
	private Node tail;
	
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			return;
		}
		Node tempNode = this.head;
		this.head = newNode;
		this.head.next  = tempNode;
	}
	
	public int pop() {
		if(this.head==null) {
			System.out.println("There are no elements to pop");
			return -1;
		}
		Node tempNode = this.head;
		this.head = this.head.next;
		System.out.println(tempNode.value);
		return tempNode.value;
	}
	
	public void print() {
		Node tempNode = this.head;
		System.out.println(tempNode.value);
		while(tempNode.next != null) {
			tempNode = tempNode.next;
			System.out.println(tempNode.value);
		}
	}
	
}
