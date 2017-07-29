package com.kapoopr.rest.recursion;

public class TowerOfHanoi {
	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
		towerOfHanoi.towerOfHanoi(3, 'A', 'B', 'C');
	}

	public void towerOfHanoi(int height, char from, char via, char to) {
		if (height == 1) {
			System.out.println(from + "--->" + to);
		} else {
			towerOfHanoi(height - 1, from, to, via);
			System.out.println(from + "--->" + to);
			towerOfHanoi(height - 1, via, from, to);
		}

	}
}
