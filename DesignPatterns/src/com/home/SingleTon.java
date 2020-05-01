package com.home;

public class SingleTon {

	public String Name;
	public static SingleTon SingleTonObj = null;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (SingleTonObj == null) {
			SingleTonObj = new SingleTon();
			return SingleTonObj;
		}

		else
			return SingleTonObj;

	}

}
