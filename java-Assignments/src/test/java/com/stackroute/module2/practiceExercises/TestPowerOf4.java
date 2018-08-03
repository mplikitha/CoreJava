package com.stackroute.module2.practiceExercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPowerOf4 {
	CheckPowerOf4 number=new CheckPowerOf4 ();
	@Test
	void powerof4() {
		int num=16;
		assertEquals(true,number.isPowerOfFour( num));
	}
	@Test
	void notpowerof4() {
		int num=15;
		assertEquals(false,number.isPowerOfFour( num));
	}

}
