package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestAddintegers {
	Addintegers numbers = new Addintegers();

	@Test
	void testSumofIntegers() {
		int n=3;
		int a[]= {1,2,3};
		
		
		assertEquals(6, numbers.doAddition(a,n));

	}

}
