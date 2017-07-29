package com.kapoopr.rest.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
	private List<Integer> factors;
	private int number;

	public PrimeFactors() {
		factors = new ArrayList<Integer>();
	}

	public static void main(String[] args) {
		PrimeFactors factors = new PrimeFactors();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number\n");
		factors.number = scanner.nextInt();
		factors.computePrimeFactors();
		factors.display();
	}

	private void computePrimeFactors() {
		pullFactorsOfN(2);
		int fact = 3;
		int upperBound = (int) Math.sqrt(number);
		while (fact < upperBound) {
			pullFactorsOfN(fact);
			fact += 2;
			upperBound = (int) Math.sqrt(number);

		}
		if (isPrime(number)) {
			factors.add(number);
		}
	}

	private void pullFactorsOfN(int fact) {
		while (number % fact == 0) {
			factors.add(fact);
			number = number / fact;
		}

	}

	private void display() {
		for (int i : factors) {
			System.out.print(i + ",");
		}
	}

	private boolean isPrime(int n) {
		int count = 0;
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			flag = true;
		}
		return flag;
	}
}
