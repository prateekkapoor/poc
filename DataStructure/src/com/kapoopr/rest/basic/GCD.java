package com.kapoopr.rest.basic;

public class GCD {
	public static void main(String[] args) {
		GCD gcd = new GCD();
		System.out.println("gcd.computeGCD(66, 78) = " + gcd.computeGCD(66, 78));
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int computeGCD(int a, int b) {
		while (b != 0) {
			int rem = a % b;
			a = b;
			b = rem;

		}
		return a;
	}
}
