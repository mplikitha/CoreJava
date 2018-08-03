package com.stackroute.module2.practiceExercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringPalindrome {
	CheckStringPalindrome input=new CheckStringPalindrome();
	@Test
	void testpalindrome() {
		String str="madam";
		assertEquals(true,input.isPalindrome(str));
		
	}
	@Test
	void testNotpalindrome() {
		String str="mad";
		assertEquals(false,input.isPalindrome(str));
		
	}
	

}
