package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenorOddTest {
EvenorOdd num=new EvenorOdd();
	@Test
	void checkEven() {
		int number=22;
		assertEquals("Jerry", num.checkEvenorOdd( number));
		
	}
	@Test
	void checkOdd() {
		int number=21;
		assertEquals("Tom", num.checkEvenorOdd( number));
	}
	@Test
	void checkForOutOfRange() {
		int number=35;
		assertEquals("out of range", num.checkEvenorOdd( number));
	}

}
