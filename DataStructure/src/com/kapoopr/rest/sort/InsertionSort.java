package com.kapoopr.rest.sort;

public class InsertionSort {
	int n[];

	public InsertionSort() {
		int n[] = { 3, 4, 9, 2, 1, 3, 7, 8, 11, 0 };
		this.n = n;
	}

	public void sort() {
		int i = 1;
		while (i < n.length) {
			int j = i - 1;
			int x = n[i];
			while (j != -1 && n[j] > x) {
				n[j + 1] = n[j];
				j--;
			}
			n[j + 1] = x;
			i++;
		}

	}

	public void display() {
		for (int i : n) {
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("original array\n");
		insertionSort.display();
		insertionSort.sort();
		System.out.println();
		System.out.println("sorted  array\n");
		insertionSort.display();

	}
}
