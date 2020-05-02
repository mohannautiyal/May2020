package com.home.builder;

public class Computer {

	@Override
	public String toString() {
		return "Computer [RAM=" + RAM + ", Processor=" + Processor + ", HDD=" + HDD + ", GraphicsCard=" + GraphicsCard
				+ ", SmartDisplay=" + SmartDisplay + "]";
	}

	private String RAM;
	private String Processor;
	private String HDD;

	private boolean GraphicsCard;
	private boolean SmartDisplay;

	public Computer(ComputerBuilder builder) {
		super();
		this.RAM = builder.RAM;
		this.Processor = builder.Processor;
		this.HDD = builder.HDD;
		this.GraphicsCard = builder.GraphicsCard;
		this.SmartDisplay = builder.SmartDisplay;
	}

	static class ComputerBuilder {

		String RAM;
		String Processor;
		String HDD;
		boolean GraphicsCard;
		boolean SmartDisplay;

		public ComputerBuilder(String rAM, String processor, String hDD) {
			//super();
			RAM = rAM;
			Processor = processor;
			HDD = hDD;
		}

		public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
			GraphicsCard = graphicsCard;
			return this;
		}

		public ComputerBuilder setSmartDisplay(boolean smartDisplay) {
			SmartDisplay = smartDisplay;
			return this;
		}

		public Computer Build() {
			return new Computer(this);
		}

	}

}
