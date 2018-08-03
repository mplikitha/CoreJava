package com.stackroute.module2.practiceExercises;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner NumScanner = new Scanner(System.in);
		//Scanner grScanner = new Scanner(System.in); 
		System.out.println("Enter the total number of students");
		int numOfStudent;
		
		numOfStudent = NumScanner.nextInt();
		int grade[]=new int[numOfStudent];
		for(int i=0;i<numOfStudent;i++) {
			System.out.println("enter grade for student"+(i+1));
			grade[i] = NumScanner.nextInt();
		}
		System.out.println(averageOfGrade(numOfStudent,grade));
		System.out.println(getMaximumGrade(numOfStudent,grade));
		System.out.println(getMinimumGrade(numOfStudent,grade));
		
	}
	public static float averageOfGrade(int num,int grade[]) {
		float Average=0;
		for(int i=0;i<num;i++) {
			Average=Average+grade[i];
		}
		return Average/num;
		
	}
	public static int getMaximumGrade(int num,int grade[]) {
		int maximumGrade;
		maximumGrade = grade[0]; 
	    for(int i=1;i < grade.length;i++){ 
	      if(grade[i] > maximumGrade){ 
	         maximumGrade = grade[i]; 
	      } 
	    } 
	    return maximumGrade; 
	}
	public static int getMinimumGrade(int num,int grade[]) {
		int minimumGrade;
		minimumGrade = grade[0]; 
	    for(int i=1;i < grade.length;i++){ 
	      if(grade[i] < minimumGrade){ 
	         minimumGrade = grade[i]; 
	      } 
	    } 
	    return minimumGrade; 
	}
	
	

}
