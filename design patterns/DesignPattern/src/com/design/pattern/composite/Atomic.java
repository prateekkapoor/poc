package com.design.pattern.composite;

public class Atomic implements Expression {
	private double value;

	public Atomic(double value) {
		this.value = value;
	}

	@Override
	public double getValue() {
		return value;
	}
}
