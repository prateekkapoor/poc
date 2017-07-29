package com.kapoopr.rest.queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue test = new Queue(16);
		test.enqueue(10);
		test.enqueue(20);
		test.enqueue(30);
		test.enqueue(40);
		test.enqueue(50);
		test.enqueue(60);
		test.enqueue(70);
		test.enqueue(80);
		test.enqueue(90);
		test.enqueue(100);
		test.enqueue(110);
		test.enqueue(120);
		test.enqueue(130);
		test.enqueue(140);
		test.enqueue(150);
		test.enqueue(160);
		test.enqueue(170);
		test.enqueue(180);
		test.display();
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
		System.out.print(test.dequeue() + ",");
	}
}
