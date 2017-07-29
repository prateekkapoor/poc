package com.design.pattern.composite;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionTest {

	@Test
	public void testAtomicExpression() {
		Expression expression = new Atomic(5.00);
		Assert.assertEquals(5.00, expression.getValue(), .001);
	}

	@Test
	public void testAdderExpression() {
		Expression e1 = new Atomic(5.00);
		Expression e2 = new Atomic(15.00);
		Expression adder = new Adder(e1, e2);
		Assert.assertEquals(e1.getValue() + e2.getValue(), adder.getValue(),
				.001);
	}

	@Test
	public void testSubractorExpression() {
		Expression e1 = new Atomic(15.00);
		Expression e2 = new Atomic(5.00);
		Expression sub = new Subtractor(e1, e2);
		Assert.assertEquals(e1.getValue() - e2.getValue(), sub.getValue(), .001);
	}

	@Test
	public void testMultiplierExpression() {
		Expression e1 = new Atomic(5.00);
		Expression e2 = new Atomic(15.00);
		Expression multiplier = new Multiplier(e1, e2);
		Assert.assertEquals(e1.getValue() * e2.getValue(),
				multiplier.getValue(), .001);
	}

	@Test
	public void testDividerExpression() {
		Expression e1 = new Atomic(5.00);
		Expression e2 = new Atomic(15.00);
		Expression divider = new Divider(e1, e2);
		Assert.assertEquals(e1.getValue() / e2.getValue(), divider.getValue(),
				.001);
	}

	@Test
	public void testComplesExpression() {
		// (2+4)*5/(3+2)
		Expression complexExpression = new Divider(new Multiplier(new Adder(
				new Atomic(2), new Atomic(4)), new Atomic(5)), new Adder(
				new Atomic(3), new Atomic(2)));
		Assert.assertEquals((2+4)*5/(3+2), complexExpression.getValue(),
				.001);
	}
}
