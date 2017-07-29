package com.kapoopr.rest.search;

public class LinearSearch {
	int n[];

	public LinearSearch() {
		int k[] = { 9, 2, 5, 2, 4, 0, 3, 7, 1, 8 };
		n = k;
	}

	public static void main(String[] args) {
		LinearSearch linearSearch = new LinearSearch();
		linearSearch.display();
		linearSearch.performSearch(8);
	}

	public void performSearch(int num) {
		int i = 0;
		boolean flag = false;
		int pos = -1;
		while (!flag && i < n.length) {
			if (n[i] == num) {
				pos = i + 1;
				flag = true;
			}
			i++;
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
