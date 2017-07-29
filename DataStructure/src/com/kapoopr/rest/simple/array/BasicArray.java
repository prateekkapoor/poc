package com.kapoopr.rest.simple.array;

public class BasicArray {
	int n[];

	public BasicArray(int[] n) {
		this.n = n;
	}

	public int findMax() {
		int max = Integer.MIN_VALUE;

		for (int i : n) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public int findMin() {
		int min = Integer.MAX_VALUE;

		for (int i : n) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public int sumArray() {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return sum;
	}

	public double meanArray() {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return (double) sum / (double) n.length;

	}

	public double varianceArray() {
		double variance;
		double mean = meanArray();
		double sum = 0;
		for (int i : n) {
			sum += (mean - i) * (mean - i);
		}
		variance = sum / n.length;
		return variance;
	}

	public double standardDeviation() {
		return Math.sqrt(varianceArray());
	}
}
