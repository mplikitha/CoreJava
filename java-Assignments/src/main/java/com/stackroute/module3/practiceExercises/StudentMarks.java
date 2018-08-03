package com.stackroute.module3.practiceExercises;

import java.util.Scanner;
import java.io.*;

public class StudentMarks  {
	private static final Exception Exception = null;

	public static void main(String []args) throws Exception {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the total number of students");
	int numOfStudent;
	numOfStudent = input.nextInt();
	
	int grade[]=new int[numOfStudent];
	
	for(int i=0;i<numOfStudent;i++) {
		System.out.println("enter grade for student"+(i+1));
		grade[i] = input.nextInt();
		
	}
	for(int i=0;i<numOfStudent;i++) {
	try {
		
			 if(grade[i]<0 || grade[i]>100)
			 {
	             throw Exception;
	             
			 }
		
	}
	
	catch(Exception ex)
    {
        System.out.println("error!,reenter grades. grade must be between 0 and 100");
        
        
    }
	}
	
	
	
	}

}
