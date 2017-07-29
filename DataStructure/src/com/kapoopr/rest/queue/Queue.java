package com.kapoopr.rest.queue;

public class Queue {
	int n[];
	int front;
	int rear;
	int size;

	public Queue(int size) {
		n = new int[size];
		front = -1;
		rear = -1;
		this.size = size;
	}

	public void enqueue(int num) {
		if (!isFull()) {
			n[++rear] = num;
		}
	}

	public Integer dequeue() {
		Integer data = null;
		if (!isEmpty()) {
			data = n[++front];
		}
		return data;

	}

	private boolean isEmpty() {
		if ((front == -1 && rear == -1) || front == size - 1) {
			System.out.println("queue is empty...");
			return true;
		}

		else
			return false;
	}

	private boolean isFull() {
		if (rear == size - 1) {
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
