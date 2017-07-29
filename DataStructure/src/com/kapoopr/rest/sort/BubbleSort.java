package com.kapoopr.rest.sort;

public class BubbleSort {
	int n[];

	public BubbleSort() {
		int k[] = { 9, 2, 5, 2, 6, 0, 3, 7, 1, 8 };
		n = k;
	}

	public void sort() {
		boolean flag = true;
		while (flag) {
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
				flag = false;
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
		BubbleSort test = new BubbleSort();
		System.out.println("unsorted array");
		test.display();
		test.sort();
		System.out.println("sorted array");
		test.display();
	}
}
