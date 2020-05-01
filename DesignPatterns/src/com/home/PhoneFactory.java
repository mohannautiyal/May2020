package com.home;

public class PhoneFactory {

	public static OperatingSoftware GetOSForPhone(String Software) {

		if (Software.equals("Android"))
			return new NormalAndroidPhone();
		if (Software.equals("Windows"))
			return new WindowsPhone();

		return null;

	}

}
