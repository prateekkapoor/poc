package com.kapoopr.rest.sparse.array;

import com.kapoopr.rest.single.linked.list.MySingleLinkedList;

public class SparseMatrix {
	MySingleLinkedList<MySingleLinkedList<Integer>> sparseArray;

	public SparseMatrix() {
		sparseArray = new MySingleLinkedList<MySingleLinkedList<Integer>>();
	}

	public void setValue(int value, int row, int col) {
		MySingleLinkedList<Integer> listRow = isRow(value);
		if (listRow == null) {
			listRow = new MySingleLinkedList<Integer>();
			listRow.addAtStart(value);
			sparseArray.addAtEnd(listRow);
		}
		
	}

	private MySingleLinkedList<Integer> isRow(int value) {
		for (MySingleLinkedList<Integer> row : sparseArray) {
			if (row.contains(value)) {
				return row;
			}
		}
		return null;
	}
}
