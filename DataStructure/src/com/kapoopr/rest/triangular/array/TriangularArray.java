package com.kapoopr.rest.triangular.array;

public class TriangularArray {
	int value;
	int n[];

	public int getValue(int row, int col) {
		int pos = mapRowColumn(row, col);
		return n[pos];
	}

	public TriangularArray(int rows) {
		int size = rows * (rows - 1) / 2;
		this.n = new int[size];
	}

	public void setValue(int value, int row, int col) {
		int pos = mapRowColumn(row, col);
		n[pos] = value;
	}

	private int mapRowColumn(int row, int col) {
		int index = 0;
		if (row < col) {
			int temp = row;
			row = col;
			col = temp;
		}
		if (row > col) {
			index = row * (row - 1) / 2 + col;
			return index;
		}
		return index;
	}

	public void display() {
		for (int i : n) {
			System.out.print(i + ",");
		}
	}
}
