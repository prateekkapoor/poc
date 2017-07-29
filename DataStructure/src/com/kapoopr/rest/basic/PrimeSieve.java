package com.kapoopr.rest.basic;

import java.util.Scanner;

public class PrimeSieve {
	boolean isprime[];
	int number;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		scanner.close();
		PrimeSieve primeSieve = new PrimeSieve(number);
		primeSieve.computePrimeList();
	}

	public PrimeSieve(int size) {
		this.number = size;
		isprime = new boolean[size + 1];
	}

	private void computePrimeList() {
		initialiseIsPrime();
		markOff(2);
		int p = 3;
		while ((p * p) < number) {
			markOff(p);
			p += 2;
		}
		display();
	}

	private void markOff(int n) {
		for (int i = 1; i < isprime.length; i++) {
			if (i % n == 0) {
				isprime[i] = false;
			}
		}

	}

	private void initialiseIsPrime() {
		for (int i = 1; i < isprime.length; i++) {
			isprime[i] = true;
		}

	}

	private void display() {
		for (int i = 1; i < isprime.length; i++) {
			if (isprime[i]) {
				System.out.print(i + ",");
			}
		}
	}
}
