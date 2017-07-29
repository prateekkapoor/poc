package com.kapoopr.rest.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	private int top = -1;
	private List<T> stack;

	public MyStack() {

		stack = new ArrayList<>();
	}

	public void push(T t) {
		stack.add(++top, t);
	}

	public T pop() {
		if (stack.isEmpty()) {
			return null;
		} else {

			T t = stack.remove(top);
			top--;
			return t;

		}

	}

	public T peek() {
		if (stack.isEmpty()) {
			return null;
		} else {
			return stack.get(top);
		}

	}

}
