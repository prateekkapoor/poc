package com.kapoopr.rest.sort;

public class BubbleSortImproved {
	int n[];

	public BubbleSortImproved() {
		int k[] = { 9, 2, 5, 2, 6, 0, 3, 7, 1, 8 };
		n = k;
	}

	public void sort() {

		while (true) {
			int i = 0;
			int c = 0;
			while (i < n.length - 1) {
				if (n[i] > n[i + 1]) {
					int t = n[i];
					n[i] = n[i + 1];
					n[i + 1] = t;
					c++;
				}
				i++;
			}
			if (c == 0) {
				break;
			}
			i = n.length - 1;
			c = 0;
			while (i >= 1) {
				if (n[i] < n[i - 1]) {
					int t = n[i];
					n[i] = n[i - 1];
					n[i - 1] = t;
					c++;
				}
				i--;
			}
			if (c == 0) {
				break;
			}
		}
	}

	public void display() {

		for (int i : n) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSortImproved test = new BubbleSortImproved();
		System.out.println("unsorted array");
		test.display();
		test.sort();
		System.out.println("sorted array");
		test.display();
	}
}
