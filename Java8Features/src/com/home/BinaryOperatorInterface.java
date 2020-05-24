package com.home;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {

	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> func = (x1,x2) -> x1+x2;
		int biOperator =func.apply(20, 30);
		System.out.println(biOperator);
		
		BiFunction<Integer,Integer,Integer> func1 = (x1,x2) -> x1+x2;
		int biFunc =func1.apply(20, 30);
		System.out.println(biFunc);
		
		
	}
}
