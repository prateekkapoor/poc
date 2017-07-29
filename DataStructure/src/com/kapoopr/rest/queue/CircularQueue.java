package com.kapoopr.rest.queue;

public class CircularQueue {
	int n[];
	int front;
	int rear;
	int size;

	public CircularQueue(int size) {
		n = new int[size];
		front = 0;
		rear = 0;
		this.size = size;
	}

	public void enqueue(int num) {
		if (!isFull()) {
			n[rear++ % size] = num;
		}
	}

	public Integer dequeue() {
		Integer data = null;
		if (!isEmpty()) {
			data = n[front++ % size];
		}
		return data;

	}

	private boolean isEmpty() {
		if (rear == front) {
			System.out.println("queue is empty...");
			return true;
		}

		else
			return false;
	}

	private boolean isFull() {
		if (front == 0 && rear == size) {
			System.out.println("queue is full...");
			return true;
		} else if (((rear % size) == front) && front != 0) {
			System.out.println("queue is full...");
			return true;
		} else {
			return false;
		}
	}

	public void display() {

		for (int i : n) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
