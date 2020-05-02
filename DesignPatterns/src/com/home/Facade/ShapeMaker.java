package com.home.Facade;

public class ShapeMaker {

	private Shape Circle;
	private Shape Rectangle;
	private Shape Square;

	public ShapeMaker() {
		Circle = new Circle();
		Rectangle = new Rectangle();
		Square = new Square();
	}

	public void drawCircle() {
		Circle.drawShape();
	}

	public void drawRectangle() {
		Rectangle.drawShape();
	}

	public void drawSquare() {
		Square.drawShape();
	}

}
