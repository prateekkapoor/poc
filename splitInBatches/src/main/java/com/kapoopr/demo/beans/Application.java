package com.kapoopr.demo.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class Application {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		DataGenerator dataGenerator = new DataGenerator();
		List<String> names = dataGenerator.getCompanyData(getDummyData());
		for (String name : names) {
			System.out.println(name);
		}
	}

	private static List<String> getDummyData() {
		List<String> dummyList = new ArrayList<String>();
		Random random = new Random(99);
		for (int i = 1; i <= 1057; i++) {
			String str = random.nextInt(100000) + "str";
			dummyList.add(str);
		}
		return dummyList;
	}
}
