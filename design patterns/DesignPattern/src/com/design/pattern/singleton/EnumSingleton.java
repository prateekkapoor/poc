package com.design.pattern.singleton;

public enum EnumSingleton {
	instance;
	String dataSource;

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	private EnumSingleton() {
		dataSource = "ENUM Data source";
	}

}
