package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringreverse {
	Stringreverse string=new Stringreverse();
	
	@Test
	void teststring2reverse() {
		String str="london";
		assertEquals("nodnol",string.doreverse(str));
		
		
	}

}
