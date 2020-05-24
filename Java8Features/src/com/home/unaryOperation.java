package com.home;

import java.util.function.UnaryOperator;

public class unaryOperation {

	
	public static void main(String[] args) {
		UnaryOperator<String> func = x -> x.toLowerCase();
		String unOps = func.apply("AaMb");
		System.out.println(unOps);
		
	}
}
