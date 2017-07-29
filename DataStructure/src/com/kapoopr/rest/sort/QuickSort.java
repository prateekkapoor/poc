package com.kapoopr.rest.sort;

public class QuickSort {
	int n[];

	public QuickSort() {
		int n[] = { 4, 9, 3, 7, 8, 2, 1 };
		this.n = n;
	}

	public void sort(int start, int end) {
		if (start < end) {
			int mid = partition(start, end);
			sort(start, mid);
			sort(mid + 1, end);

		}

	}

	public int partition(int start, int end) {

		int x = n[start];
		int left = start;
		int right = end - 1;
		while (left < right) {
			while (x > n[left]) {
				left++;
			}
			while (n[right] > x) {
				right--;
			}
			if (left < right) {
				int t = n[left];
				n[left] = n[right];
				n[right] = t;
			}

		}
		return right;

	}

	public void display() {
		for (int i : n) {
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		System.out.println("original array\n");
		quickSort.display();
		quickSort.sort(0, quickSort.n.length);
		System.out.println();
		System.out.println("sorted  array\n");
		quickSort.display();

	}
}
