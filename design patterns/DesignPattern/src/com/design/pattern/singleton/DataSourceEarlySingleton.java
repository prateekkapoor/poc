package com.design.pattern.singleton;

public class DataSourceEarlySingleton {
	public static volatile DataSourceEarlySingleton instance = new DataSourceEarlySingleton();
	private String dataSource;

	public String getDataSource() {
		return dataSource;
	}

	private DataSourceEarlySingleton() {
		dataSource = "dataSourceOject";
	}

	public static DataSourceEarlySingleton getInstance() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("singleton class");
	}

}
