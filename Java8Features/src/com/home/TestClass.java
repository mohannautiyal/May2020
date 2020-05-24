package com.home;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestClass {

	
	public static void main(String[] args) {
		
		//Square of number
		Function<Integer,Integer> f = x->x*x;
		System.out.println("Square of number 20 is "+f.apply(20));
		
		// Even number test 
		Predicate<Integer> EvenOdd = x -> x%2 == 0;
		System.out.println("Is 10 Even " + EvenOdd.test(10));
		System.out.println("Is 15 Even " + EvenOdd.test(15));

	}
}
