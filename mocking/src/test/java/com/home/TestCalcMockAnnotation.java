package com.home;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestCalcMockAnnotation {

	@Mock
	ArithmethicOperations Operation;
	
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);

	}
	
	@Test
	public void TetMockAnnotation() {

		when(Operation.add(30, 50)).thenReturn(80);
		int sum =Operation.add(30, 50);
		assertTrue("Sum of numbers is incorrect", sum == 80);
		
	}
	
	
	
	
}
