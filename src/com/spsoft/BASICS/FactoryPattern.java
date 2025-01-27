package com.spsoft.BASICS;

public class FactoryPattern {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
	}
}
