package com.design.pattern.singleton;

public class DataSourceLazySingleton {
	public static volatile DataSourceLazySingleton instance;
	private String dataSource;

	public String getDataSource() {
		return dataSource;
	}

	private DataSourceLazySingleton() {
		dataSource = "dataSourceOjectLazy";

	}

	public static DataSourceLazySingleton getInstance() {
		if (instance == null) {
			synchronized (DataSourceLazySingleton.class) {
				if (instance == null) {
					synchronized (DataSourceLazySingleton.class) {
						instance = new DataSourceLazySingleton();
					}

				}
			}
		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
