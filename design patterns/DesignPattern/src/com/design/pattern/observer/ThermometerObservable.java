package com.design.pattern.observer;

public class ThermometerObservable extends AbstractObservable {
	private String temperature;

	protected void update() {
		super.update();
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
		update();
	}
}
