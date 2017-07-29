package com.design.pattern.observer;

public class Client {
	public static void main(String[] args) {
		Observer observer = new FirstObserver();
		ThermometerObservable observable = new ThermometerObservable();
		observable.add(observer);
		Driver driver = new Driver();
		driver.startDriver(observable);

	}
}
