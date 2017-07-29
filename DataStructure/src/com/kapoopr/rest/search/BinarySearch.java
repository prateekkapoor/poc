package com.kapoopr.rest.search;

public class BinarySearch {
	int n[];

	public BinarySearch() {
		int k[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		n = k;
	}

	public static void main(String[] args) {
		BinarySearch linearSearch = new BinarySearch();
		linearSearch.display();
		linearSearch.performSearch(9);
	}

	public void performSearch(int num) {
		int pos = -1;
		int start = 0;
		int end = n.length - 1;
		boolean flag = false;
		while (!flag && start <= end) {
			int mid = (start + end) / 2;
			if (n[mid] == num) {
				pos = mid + 1;
				flag = true;
			} else if (n[mid] > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (pos == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("Number found at Pos: " + pos);
		}
	}

	public void display() {
		for (int i : n) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}
