package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
class DetermineCharTest {
	DetermineChar checkAlphabet = new DetermineChar();
	@Test
	void checkerForCapitalLetter() {
		char ch = 'A';
        assertEquals("Capital Letter", checkAlphabet.character(ch));
		
	}
	@Test
	void checkForSmallLetter() {
		char ch='a';
		assertEquals("small Letter", checkAlphabet.character(ch));
		
	}
	@Test
	void checkForDigit() {
		char ch='3';
		assertEquals("digit", checkAlphabet.character(ch));
		
	}
	@Test
	void checkForSpecialSymbol() {
		char ch='@';
		assertEquals("special Symbol", checkAlphabet.character(ch));
		
	}
	

}
