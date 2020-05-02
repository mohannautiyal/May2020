package com.home.Facade;

public class TestFacadePattern {

	public static void main(String[] args) {

		ShapeMaker shapeFactory = new ShapeMaker();
		shapeFactory.drawCircle();
		shapeFactory.drawRectangle();
		shapeFactory.drawSquare();
		
		
	}

}
