package com.home.builder;

public class Car {
	
	
	String name;
	String color;
	int mileage;
	String fuel;
	boolean AntiBreakingSystem;
	
	public Car(String name, String color, int mileage, String fuel, boolean antiBreakingSystem) {
		super();
		this.name = name;
		this.color = color;
		this.mileage = mileage;
		this.fuel = fuel;
		AntiBreakingSystem = antiBreakingSystem;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", mileage=" + mileage + ", fuel=" + fuel
				+ ", AntiBreakingSystem=" + AntiBreakingSystem + "]";
	}
	
	

}
