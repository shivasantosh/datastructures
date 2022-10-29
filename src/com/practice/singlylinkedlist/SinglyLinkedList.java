package com.practice.singlylinkedlist;

public class SinglyLinkedList {

	Node head;
	Node tail;
	
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			return;
		}
		Node tempNode = this.head;
		while(tempNode.next != null) {
			tempNode  = tempNode.next;
		}
		tempNode.next  = newNode;
		this.tail = tempNode.next;
	}
	
	public void pushAtIndex(int index,int value) {
		int count = 0;
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			return;
		}
		Node tempNode = this.head;
		if(index ==0) {
			this.head=newNode;
			this.head.next = tempNode;
			this.tail= this.head.next;
			return;
		}else {
			while(tempNode.next != null) {
				count++;
				Node nextNode = tempNode.next;
				if(count == index) {
					tempNode.next = newNode;
					tempNode.next.next = nextNode;
					this.tail=tempNode.next.next;
					break;
				}
			}
		}
		
	}
	
	
	
	public void deleteAtIndex(int index) {
		if(this.head == null) {
			
		}
		if(index == 0) {
			
		}
	}
	
	public void print() {
		if(this.head == null) {
			System.out.println("No elements to print");
		}
		Node tempNode = this.head;
		while(tempNode.next != null) {
			System.out.println(tempNode.value);
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.value);
	}
	
}
