package com.kapoopr.rest.stack;

public class MyDoubleStack {
	private int start;
	private int end;
	private int size;
	private int[] stack;

	public MyDoubleStack(int size) {
		this.size = size;
		start = -1;
		end = size;
		stack = new int[size];
	}

	public void pushStart(int t) {
		if (!isfull()) {
			stack[++start] = t;
		}
	}

	private boolean isfull() {
		if (start + 1 == end) {
			System.out.println("Stack full!!!!");
			return true;
		}
		return false;
	}

	public Integer popStart() {
		if (isEmpty()) {
			return null;
		} else {
			int data = stack[start];
			start--;
			return data;

		}

	}

	private boolean isEmpty() {
		if (start == -1 && end == size) {
			System.out.println("Stack Empty!!!!");
			return true;
		}
		return false;
	}

	public Integer peekEnd() {
		if (isEmpty()) {
			return null;
		} else {
			return stack[end];
		}

	}

	public void pushEnd(int t) {
		if (!isfull()) {
			stack[--end] = t;
		}
	}

	public Integer popEnd() {
		if (isEmpty()) {
			return null;
		} else {
			int data = stack[end];
			end++;
			return data;

		}

	}

	public Integer peekStart() {
		if (isEmpty()) {
			return null;
		} else {
			return stack[start];
		}

	}

	public void display() {
		for (int i : stack) {
			System.out.print(i + ",");
		}
	}

}
