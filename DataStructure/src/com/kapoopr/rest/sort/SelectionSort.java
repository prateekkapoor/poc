package com.kapoopr.rest.sort;

public class SelectionSort {
	int n[];

	public SelectionSort() {
		int k[] = { 9, 2, 5, 2, 6, 0, 3, 7, 1, 8 };
		n = k;
	}

	public void sort() {

		int i = 0;
		while (i < n.length - 1) {
			int min = i;
			int j = i + 1;
			while (j < n.length) {
				if (n[min] > n[j]) {
					min = j;

				}
				j++;

			}
			int t = n[min];
			n[min] = n[i];
			n[i] = t;
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
		SelectionSort test = new SelectionSort();
		System.out.println("unsorted array");
		test.display();
		test.sort();
		System.out.println("sorted array");
		test.display();
	}
}
