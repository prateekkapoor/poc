package com.design.pattern.composite;

public class Subtractor extends BinaryExpression {
	public Subtractor(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return expression1.getValue() - expression2.getValue();
	}
}
