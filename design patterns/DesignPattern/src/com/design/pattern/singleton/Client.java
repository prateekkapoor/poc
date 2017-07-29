package com.design.pattern.singleton;

public class Client {
	public static void main(String[] args) {
		System.out.println("data source:"
				+ DataSourceEarlySingleton.getInstance().getDataSource());
		System.out.println("data source:"
				+ DataSourceLazySingleton.getInstance().getDataSource());
		System.out.println("data source:"
				+ EnumSingleton.instance.getDataSource());
	}
}
