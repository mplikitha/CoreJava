package com.stackroute.practiceexercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberSortTest {

	
	

		NumberSort test = new NumberSort();
		@Test
		void test() {
			assertEquals("Sorted number in non-increasing order: 321\nSum of even number: 2\nFalse", test.numberSort(132));
		}
		@Test
		
		void test1() {
			assertEquals("Sorted number in non-increasing order: 5431\nSum of even number: 4\nFalse", test.numberSort(132));
		}

	}


