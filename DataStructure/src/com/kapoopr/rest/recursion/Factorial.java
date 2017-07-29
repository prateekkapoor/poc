package com.kapoopr.rest.recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("fact(5): " + Factorial.factorial(5));
		System.out.println("fact(6): " + Factorial.factorial(6));
		System.out.println("fact(-1): " + Factorial.factorial(-1));
		System.out.println("fact(-1): " + Factorial.factorial(-1));
		System.out.println("sumN(4): " + Factorial.sumN(4));
		System.out.println("sumN(5): " + Factorial.sumN(5));
		System.out.println("sumN(-1): " + Factorial.sumN(-1));
		System.out.println("fibonacci(4): " + Factorial.fibonacci(6));
	}

	public static int factorial(int n) {
		if (n <= 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static int sumN(int n) {
		if (n <= 0)
			return 0;
		return n + sumN(n - 1);
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
