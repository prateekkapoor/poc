package com.kapoopr.rest.sparse.array;

public class Multiplication2D {
	int A[][];
	int B[][];
	int C[][];
	int n;

	public Multiplication2D(int A[][], int B[][], int n) {
		this.A = A;
		this.B = B;
		this.n = n;

	}

	public void computeMultiplication() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = 0;
				for (int k = 0; k < n; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
	}

	public void display() {
		System.out.println("A");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(A[i][j] + "\t");
			}

		}
		System.out.println();
		System.out.println("B");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(B[i][j] + "\t");
			}

		}
		System.out.println();
		System.out.println("C");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(C[i][j] + "\t");
			}

		}
	}
}