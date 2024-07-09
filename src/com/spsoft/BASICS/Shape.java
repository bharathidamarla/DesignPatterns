package com.spsoft.BASICS;

public interface Shape {
	void draw();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
