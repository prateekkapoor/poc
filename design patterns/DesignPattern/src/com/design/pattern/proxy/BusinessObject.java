package com.design.pattern.proxy;

public abstract class BusinessObject {

	public abstract void sayHi();

	public static BusinessObject create() {
		return new BusinessObjectImplementation();
	}
}