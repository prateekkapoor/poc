package com.design.pattern.composite;

public class Divider extends BinaryExpression {
	public Divider(Expression expression1, Expression expressio2) {
		super(expression1, expressio2);
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return expression1.getValue() / expression2.getValue();
	}
}
