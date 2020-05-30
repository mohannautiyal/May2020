package com.home.Streams;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main1(String[] args) {

		Stream<String> str = Stream.of("Madan","Raj","Sohan","Brijesh");
	//	String find =str.filter(x ->x.equals("Raj")).findAny().toString();
	//	System.out.println(find);
		//str.forEach(x -> System.out.println(x));
		str.map(x -> x.toUpperCase())
		   .forEach(x -> System.out.println(x));
		
	}
	
	public static void main(String[] args) {
		// Printing minimum from an array using lambda
		int num [] = {3,67,82,78,96,11};
		IntStream.of(num).min().ifPresent(System.out :: print);
		System.out.println("\n==================================");
		IntStream.of(num).distinct().sorted().limit(3)
		        .forEach(System.out::println);
		
		
		
	}

}
