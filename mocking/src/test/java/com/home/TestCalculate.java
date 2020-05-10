package com.home;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculate {

	@Test
	public void TestAdd() {
		ArithmethicOperations Operations = new ArithmethicOperations();
		int sum = Operations.add(30, 45);
		assertTrue("Sum of numbers is incorrect", sum == 75);

	}

	// Below test uses mocking
	@Test
	public void TestMockAdd() {

		ArithmethicOperations Operations = Mockito.mock(ArithmethicOperations.class);
		when(Operations.add(30, 45)).thenReturn(75);
		int sum = Operations.add(30, 45);
		System.out.println("Mocking sum operations " + sum);
		assertTrue("Sum of numbers is incorrect", sum == 75);

	}

}
