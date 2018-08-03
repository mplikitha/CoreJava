package com.stackroute.module2.practiceExercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStudentGrade {
	Student result=new Student();
	int num=4;
	int grade[]= {86,65,98,77};
	@Test
	void testForAverage() {
		
		assertEquals(81.5,result.averageOfGrade(num,grade));
	}
	@Test
	void testForMinimum() {
		
		assertEquals(65,result.getMinimumGrade(num,grade));
	}
	@Test
	void testForMaximum() {
		
		assertEquals(98,result.getMaximumGrade(num,grade));
	}


}
