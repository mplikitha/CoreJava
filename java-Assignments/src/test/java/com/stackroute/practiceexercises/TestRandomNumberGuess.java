package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRandomNumberGuess {

	RandomNumberGuess test= new RandomNumberGuess();
	@Test
	void test() {
		assertEquals(true,test.randomCheck(21,21));
	}

	@Test
	void atest() {
		assertEquals(false,test.randomCheck(3,21));
	}
	
	@Test
	void btest() {
		assertEquals(false,test.randomCheck(29,21));
	}

}
