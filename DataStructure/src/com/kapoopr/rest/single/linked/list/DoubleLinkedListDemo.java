package com.kapoopr.rest.single.linked.list;

public class DoubleLinkedListDemo {
	public static void main(String[] args) {
		MyList<Integer> list = new MyDoubleLinkedList<Integer>();
		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);
		list.addAtEnd(40);
		list.addAtStart(50);
		list.addAtStart(60);
		list.addAtStart(70);
		list.addAtStart(80);
		list.addAtEnd(90);
		list.addAtEnd(10);
		list.addAtPos(90, 100);
		list.addAtPos(70, 110);
		System.out.println(list.toString());
		list.removeAtPos(100);
		list.removeAtPos(20);
		list.removeAtPos(10);
		list.removeAtEnd();
		list.removeAtEnd();
		list.removeAtStart();
		list.removeAtStart();
		System.out.println(list.toString());
	}
}
