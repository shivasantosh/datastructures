package com.practice.stack.array;

public class StackArrayTest {

	public static void main(String[] args) {
		StackArray stack = new StackArray(3);
		stack.push(3);
		stack.push(5);
		stack.push(6);
		stack.push(6);
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
