package com.kapoopr.rest.sort;

public class BubbleSortGeneral {
	int n[];

	public BubbleSortGeneral() {
		int k[] = { 9, 2, 5, 2, 6, 0, 3, 7, 1, 8 };
		n = k;
	}

	public void sort() {
		int i = 0;
		while (i < n.length - 1) {
			int j = 0;
			while (j < n.length - i - 1) {
				if (n[j] > n[j + 1]) {
					int t = n[j];
					n[j] = n[j + 1];
					n[j + 1] = t;

				}
				j++;
			}
			i++;
		}

	}

	public void display() {

		for (int i : n) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSortGeneral test = new BubbleSortGeneral();
		System.out.println("unsorted array");
		test.display();
		test.sort();
		System.out.println("sorted array");
		test.display();
	}
}
