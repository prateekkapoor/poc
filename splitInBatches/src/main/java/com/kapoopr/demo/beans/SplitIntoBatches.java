package com.kapoopr.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class SplitIntoBatches<T> {

	public List<List<T>> getBatches(List<T> originalList) {

		int c = 0;
		List<List<T>> list = new ArrayList<List<T>>();
		if (originalList != null) {
			int batchSize = originalList.size() / ApplicationConstants.NO_OF_THREADS;
			while ((c + batchSize) < originalList.size()) {
				List<T> subList = originalList.subList(c, c + batchSize);
				if (subList != null) {
					list.add(subList);
				}
				c = c + batchSize;
			}
			List<T> subList = originalList.subList(c, originalList.size());
			if (subList != null) {
				list.add(subList);
			}
		}
		return list;

	}
}
