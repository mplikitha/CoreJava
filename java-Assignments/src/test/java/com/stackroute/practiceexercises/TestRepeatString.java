package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRepeatString {
	RepeatString string=new RepeatString();

	@Test
	void test1IsString1Repeat() {
		String str="qwe";
		int n=2;
		assertEquals("qwewewe",string.stringRepeat(str,n));
				
	}
	
	

}
