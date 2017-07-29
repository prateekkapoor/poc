package com.design.pattern.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractObservable implements Observable {
	Set<Observer> observers = new HashSet<Observer>();

	@Override
	public void add(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyAllDependents() {
		for (Observer observer : observers) {
			observer.change(this);
		}

	}

	protected void update() {
		notifyAllDependents();

	}

}
