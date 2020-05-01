package com.home;

public class TestPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		OperatingSoftware OS1 = PhoneFactory.GetOSForPhone("Android");
		OperatingSoftware OS2 = PhoneFactory.GetOSForPhone("Windows");
		OS1.LoadPhone();
		OS2.LoadPhone();

	
	}

}
