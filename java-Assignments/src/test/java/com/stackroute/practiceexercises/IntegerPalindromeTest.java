package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerPalindromeTest {

	IntegerPalindrome test = new IntegerPalindrome();

	@Test
	void test() {
		assertEquals("2121 is not palindrome",test.palindromeCheck(2121));
	}
}
