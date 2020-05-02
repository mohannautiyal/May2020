package com.home;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Car car = new CarBuilder().setColor("Blue").getCar();
		System.out.println(car);
		
		Car car2 = new CarBuilder().setName("Maruti").setAntiBreakingSystem(true).getCar();
		System.out.println(car2);
		
		
	}

}
