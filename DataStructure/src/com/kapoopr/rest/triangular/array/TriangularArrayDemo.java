package com.kapoopr.rest.triangular.array;

public class TriangularArrayDemo {
	public static void main(String[] args) {
		TriangularArray triangularArray = new TriangularArray(4);
		int n[][] = { { 0, 500, 300, 2000 }, { 500, 0, 250, 1000 },
				{ 300, 250, 0, 1700 }, { 2000, 1000, 1700, 0 } };
		for (int row = 0; row < 4; row++) {
			System.out.println();
			for (int col = 0; col < 4; col++) {
				if (row != col)
					triangularArray.setValue(n[row][col], row, col);
				System.out.print(n[row][col] + "\t");
			}
		}
		System.out.println();
		System.out.println("Triangular matrix in I-D");
		triangularArray.display();
	}
}
