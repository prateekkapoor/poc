package com.kapoopr.rest.recursion;

public class Fibonacci {
	public int fibonacciSeries(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int f1 = 1;
		int f2 = 1;
		int f3 = f1 + f2;
		for (int i = 1; i <= n - 3; i++) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;

		}
		return f3;
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 1; i <= 10; i++) {
			System.out.print(fibonacci.fibonacciSeries(i) + ",");
		}
	}
}
