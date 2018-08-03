package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNthiteration {
	Nthiteration num=new Nthiteration();

	@Test
	void testIteration() {
		int number=2;
		assertEquals("122",num.doiteration(number));
		
	}
	
}
