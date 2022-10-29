package com.practice.doublylinkedlist;

public class DoublyLinkedList {
	
	Node head;
	Node tail;
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			return;
		}
		Node tempNode = this.head;
		while(tempNode.next !=null) {
			tempNode = tempNode.next;
		}
		newNode.prev = tempNode;
		tempNode.next = newNode;
	}
	
	public void pushAtIndex(int index, int value) {
		
	}

}
