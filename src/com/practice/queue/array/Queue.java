package com.practice.queue.array;

public class Queue {

	private int[] arr;
	private int top;
	private int beginning;
	
	public Queue(int size) {
		arr = new int[size];
		this.top=-1;
		this.beginning =-1;
	}
	
	public boolean isEmpty() {
		return (this.top == -1 && this.beginning==this.arr.length-1); 
	}
	
	public boolean isFull() {
		return (this.beginning==this.arr.length-1); 
	}
	
	public void push(int value) {
		if(isEmpty()) {
			arr[this.top+1] = value;
		}else {
			System.out.println("queue is full");
		}
	}
}
