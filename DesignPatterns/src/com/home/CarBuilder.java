package com.home;

public class CarBuilder {

	String name;
	String color;
	int mileage;
	String fuel;
	boolean AntiBreakingSystem;

	public CarBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}

	public CarBuilder setMileage(int mileage) {
		this.mileage = mileage;
		return this;
	}

	public CarBuilder setFuel(String fuel) {
		this.fuel = fuel;
		return this;
	}

	public CarBuilder setAntiBreakingSystem(boolean antiBreakingSystem) {
		AntiBreakingSystem = antiBreakingSystem;
		return this;
	}

	public Car getCar() {
		return new Car(name, color, mileage, fuel, AntiBreakingSystem);
	}

}
