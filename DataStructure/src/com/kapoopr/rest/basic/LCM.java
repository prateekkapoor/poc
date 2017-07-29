package com.kapoopr.rest.basic;

public class LCM {
	public static void main(String[] args) {
		LCM lcm = new LCM();
		System.out.println("lcm.computeLCM(66, 78) " + lcm.computeLCM(66, 78));

	}

	private int computeLCM(int a, int b) {
		GCD gcdFun = new GCD();
		int gcd = gcdFun.computeGCD(a, b);
		return (a / gcd) * b;
	}
}
