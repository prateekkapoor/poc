package com.design.pattern.composite;

public class Adder extends BinaryExpression {
	public Adder(Expression expression1, Expression expressio2) {
		super(expression1, expressio2);
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return expression1.getValue() + expression2.getValue();
	}
}
