package com.home;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssertions {

	@Test
	public void TestHardAssertions() {
		System.out.println("Starting Hard Assertions");

		assertEquals(5, 6);
		System.out.println("This is not executed");
		assertEquals(6, 6);

	}

	
	
	@Test
	public void TestSoftAssertions() {
		System.out.println("Starting Soft Assertions");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(5, 6);
		System.out.println("This should be executed");
		
		sa.assertEquals(6, 6);
		sa.assertAll();

	}
	
	
	
}
