package com.stackroute.module2.practiceExercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenNumber {
	CheckEvenNumber number=new CheckEvenNumber();
	@Test
	void testForEven() {
		int num=20;
	assertEquals(true,number.isEven(num));	
	}
	@Test
	void testForNotEven() {
		int num=3;
	assertEquals(false,number.isEven(num));	
	}

}
