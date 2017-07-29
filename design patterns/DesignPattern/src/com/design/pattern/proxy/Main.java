package com.design.pattern.proxy;

public class Main {
	public static void main(String[] args) {

		BusinessObject businessObject = new ProxyObjectImplementation(
				BusinessObject.create());
		businessObject.sayHi();
	}
}
