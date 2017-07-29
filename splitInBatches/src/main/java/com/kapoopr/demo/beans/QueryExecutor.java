package com.kapoopr.demo.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class QueryExecutor implements Callable<List<String>> {
	private List<String> isrns;

	public List<String> call() throws Exception {
		Thread.sleep(10);
		List<String> names = new ArrayList<String>();
		for (String isrn : isrns) {
			names.add(isrn + "dummy");
		}
		return names;
	}

	public List<String> getIsrns() {
		return isrns;
	}

	public void setIsrns(List<String> isrns) {
		this.isrns = isrns;
	}

	public QueryExecutor(List<String> isrns) {
		super();
		this.isrns = isrns;
	}

}
