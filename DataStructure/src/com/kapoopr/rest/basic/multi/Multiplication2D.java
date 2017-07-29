package com.kapoopr.rest.basic.multi;

import java.util.Scanner;

public class Multiplication2D {
	int A[][];
	int B[][];
	int C[][];

	public void initialise() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Rows for Matrix A");
		int r1 = scanner.nextInt();
		System.out.println("Enter Columns for Matrix A");
		int c1 = scanner.nextInt();
		System.out.println("Enter Rows for Matrix B");
		int r2 = scanner.nextInt();
		System.out.println("Enter Columns for Matrix B");
		int c2 = scanner.nextInt();
		if (validate(c1, r2)) {
			System.out.println("Multiplication can be performed");
			A = new int[r1][c1];
			B = new int[r2][c2];
			C = new int[r1][c2];
			System.out.println("Input Matrix A...");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					A[i][j] = scanner.nextInt();
				}
			}
			System.out.println("Input Matrix B...");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					B[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					C[i][j] = 0;
					for (int k = 0; k < c1; k++) {
						C[i][j] += A[i][k] * B[k][j];
					}
				}
			}
			System.out.println();
			System.out.println("Martrix A..");
			for (int i = 0; i < r1; i++) {
				System.out.println();
				for (int j = 0; j < c1; j++) {
					System.out.print(A[i][j] + "\t");
				}
			}
			System.out.println();
			System.out.println("Martrix B..");
			for (int i = 0; i < r2; i++) {
				System.out.println();
				for (int j = 0; j < c2; j++) {
					System.out.print(B[i][j] + "\t");
				}
			}
			System.out.println();
			System.out.println("Martrix C..");
			for (int i = 0; i < r1; i++) {
				System.out.println();
				for (int j = 0; j < c2; j++) {
					System.out.print(C[i][j] + "\t");
				}
			}

		} else {
			System.out.println("Multiplication cannot be performed");
		}
	}

	public boolean validate(int c, int r) {
		if (c == r) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Multiplication2D test = new Multiplication2D();
		test.initialise();
	}
}
