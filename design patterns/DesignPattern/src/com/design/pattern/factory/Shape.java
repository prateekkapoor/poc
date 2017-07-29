package com.design.pattern.factory;

public interface Shape {
	public void draw();

	public static Shape create(String context) throws Exception {
		Shape shape = null;
		if (context == "square") {
			shape = new Square();
		} else if (context == "triangle") {
			shape = new Triangle();
		} else if (context == "rectangle") {
			shape = new Rectangle();
		} else {
			throw new Exception("context not supported yet");
		}
		return shape;

	}
}
