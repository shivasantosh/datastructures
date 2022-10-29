package com.practice.singlylinkedlist;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.push(5);
		list.push(10);
		list.push(6);
		list.push(4);
		list.print();
		list.pushAtIndex(1, 8);
		list.print();
	
	}

}
