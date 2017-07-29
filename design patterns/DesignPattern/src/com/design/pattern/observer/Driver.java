package com.design.pattern.observer;

public class Driver {

	public void startDriver(ThermometerObservable observable) {

		observable.setTemperature("10");
		observable.setTemperature("20");
		observable.setTemperature("30");
		observable.setTemperature("40");

	}
}
