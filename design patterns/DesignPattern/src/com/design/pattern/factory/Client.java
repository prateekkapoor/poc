package com.design.pattern.factory;

public class Client {
	public static void main(String[] args) throws Exception {
		Shape shape = Shape.create("square");
		shape.draw();
	}
}
