package com.home;

import java.util.function.Function;

public class funcInterface {

	public static void main(String[] args) {

		
		Function<String,Integer> func = x -> x.length();
		int StrLength =func.apply("This is Hello Java 8");
		System.out.println(StrLength);
		
		Function<Integer,Integer> func1 = x ->x * 2;
		int chEx = func.andThen(func1).apply("This is chaining example");
		System.out.println(chEx);
		
	}

}
