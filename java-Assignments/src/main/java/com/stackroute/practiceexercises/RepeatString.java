package com.stackroute.practiceexercises;

import java.util.Scanner;

public class RepeatString {
	String stringRepeat(String input, int n) {
		
		String substr = input.substring(input.length()-n);
		
		StringBuilder sb = new StringBuilder(n);
		for (int i = 0; i < n; ++i)
		{ 
		    sb.append(substr);
		}
		String result = sb.toString();
		return input+result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatString string=new RepeatString();
		Scanner str = new Scanner(System.in);
		System.out.println("enter number of n charecters to be repeated n times");
		 int n = str.nextInt();
		 System.out.println("enter string");
		 String input;
		 input=str.next();
		 
		string.stringRepeat(input,n);
		
		
		
		    }
	

}
