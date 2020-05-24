package com.home;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaCollections {

	public static void main(String[] args) {

		List<String> students = Arrays.asList("Raj", "Shyam", "Manu", "Ravi");

		// Printing using anonymous classes
		students.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t + " ");
			}

		});

		// Printing using Lambda expressions
		System.out.println("\n===============================");
		students.forEach(str -> System.out.print(str + " "));

		// Printing using Method references
		System.out.println("\n===============================");
		students.forEach(System.out::println);

	}

}
