package com.kapoopr.rest.stack;

public class MyDoubleStackDemo {
	public static void main(String[] args) {
		MyDoubleStack myStack = new MyDoubleStack(16);
		myStack.pushStart(4);
		myStack.pushEnd(80);
		myStack.pushStart(10);
		myStack.pushEnd(90);
		myStack.pushStart(20);
		myStack.pushEnd(100);
		myStack.pushStart(30);
		myStack.pushEnd(110);
		myStack.pushStart(40);
		myStack.pushEnd(120);
		myStack.pushStart(50);
		myStack.pushEnd(130);
		myStack.pushStart(60);
		myStack.pushEnd(140);
		myStack.pushStart(70);
		myStack.pushEnd(150);
		myStack.pushEnd(160);
		myStack.pushEnd(170);
		myStack.pushEnd(180);
		
		myStack.display();
		System.out.println(myStack.peekStart());
		System.out.println(myStack.peekEnd());
		System.out.println("popped items");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		System.out.print(myStack.popStart() + ",");
		System.out.print(myStack.popEnd() + ",");
		

	}
}
