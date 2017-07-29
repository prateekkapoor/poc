package com.design.pattern.observer;

public class FirstObserver implements Observer {

	@Override
	public void change(Observable observable) {
		if (observable instanceof ThermometerObservable) {
			ThermometerObservable temp = (ThermometerObservable) observable;
			System.out.println();
			System.out.println("Driver Update # Tempertaure in celcius"
					+ temp.getTemperature());
		}

	}

}
