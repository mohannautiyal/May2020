package com.home.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Car car = new CarBuilder().setColor("Blue").getCar();
		System.out.println(car);
		
		Car car2 = new CarBuilder().setName("Maruti").setAntiBreakingSystem(true).getCar();
		System.out.println(car2);
		
		
		Computer comp = new Computer.ComputerBuilder("2GB","Core2Duo","1TB").setGraphicsCard(true).Build();
		System.out.println(comp);
		
		
		
	}

}
