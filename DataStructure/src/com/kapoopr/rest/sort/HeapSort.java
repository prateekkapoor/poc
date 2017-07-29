package com.kapoopr.rest.sort;

public class HeapSort {
	int n[];

	public HeapSort() {
		int n[] = { 9, 4, 1, 5, 7, 3, 6, 2, 8 };
		this.n = n;
	}

	public void sort() {

	}

	public void buildHeap() {
		int i = n.length - 1;
		while (i > 0) {
			heapify(i, n.length);
			i--;
		}
	}

	private void heapify(int i, int length) {
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		int largest = i;
		if (left < length && n[left] > n[i]) {
			largest = left;
		}
		if (right < length && n[right] > n[largest]) {
			largest = right;
		}
		if (largest != i) {
			int t = n[i];
			n[i] = n[largest];
			n[largest] = t;
			heapify(largest, length);
		}

	}

	private void heapSort() {
		int j = n.length - 1;
		while (j > 0) {
			int t = n[0];
			n[0] = n[j];
			n[j] = t;
			heapify(0, j);
			j--;

		}
	}

	public void display() {
		for (int i : n) {
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		HeapSort heapSort = new HeapSort();
		System.out.println("original array\n");
		heapSort.display();
		heapSort.buildHeap();
		System.out.println();
		System.out.println("sorted  array\n");
		heapSort.heapSort();
		heapSort.display();

	}
}
