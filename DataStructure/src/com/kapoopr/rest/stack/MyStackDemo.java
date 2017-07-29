package com.kapoopr.rest.stack;

public class MyStackDemo {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(4);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		System.out.println(myStack.peek());
		System.out.println("popped items");
		System.out.print(myStack.pop() + ",");
		System.out.print(myStack.pop() + ",");
		System.out.print(myStack.pop() + ",");
		System.out.print(myStack.pop() + ",");
		System.out.print(myStack.pop() + ",");
		System.out.print(myStack.pop() + ",");
		System.out.print(myStack.pop() + ",");

	}
}
