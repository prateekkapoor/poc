package com.design.pattern.composite;

public abstract class BinaryExpression implements Expression {
	protected Expression expression1;
	protected Expression expression2;

	public BinaryExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

}
