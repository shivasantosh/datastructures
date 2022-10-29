package com.practice.stack.array;

import java.util.Arrays;

public class StackArray {

	int[] arr;
	int top;
	
	public StackArray(int size) {
		this.arr = new int[size];
		this.top =-1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		arr[this.top+1] =value;
		top++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("No Elements are present in stack");
			return -1;
		}
		int value = arr[top];
		this.top--;
		return value;
	}
	
	public boolean isFull() {
		return (this.top == this.arr.length-1);
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}

	@Override
	public String toString() {
		return "StackArray [arr=" + Arrays.toString(arr) + "]";
	}
	
	
}
