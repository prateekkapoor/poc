package com.kapoopr.rest.simple.array;

public class BasicArrayDemo {
	public static void main(String[] args) {
		int n[] = { 9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6,
				9, 4 };
		BasicArray array = new BasicArray(n);
		System.out.println("Max: " + array.findMax());
		System.out.println("Min: " + array.findMin());
		System.out.println("Sum: " + array.sumArray());
		System.out.println("Mean: " + array.meanArray());
		System.out.println("variance: " + array.varianceArray());
		System.out.println("SD: " + array.standardDeviation());
	}
}
