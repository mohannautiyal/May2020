package com.home;

public class TestPatternClass {

	
	public static void main(String[] args) {
		
		// SingleTon SingleTon = new SingleTon();
		
		SingleTon SingleTon1 = SingleTon.getInstance();
		
		SingleTon SingleTon2 = SingleTon.getInstance();
		
		System.out.println(SingleTon1);
		System.out.println(SingleTon2);

		
		if(SingleTon1 == SingleTon2)
			System.out.println("Objects are Equal");
		
		else
			System.out.println("Objects are not Equal");

		
		
		
	}
}
