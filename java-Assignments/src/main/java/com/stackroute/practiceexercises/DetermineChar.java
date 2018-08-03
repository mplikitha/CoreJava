package com.stackroute.practiceexercises;
import java.util.Scanner;


public class DetermineChar {
	public static String character(char i) {
		
	
		if(i>='A'&&i<='Z') {
			
			// System.out.println("Capital Letter");
			
					return "Capital Letter";
					
		}

		else if(i>='a'&&i<='z') {
			//System.out.println("Small case Letter");
			return "small Letter";
		}
		else if(i>=48&&i<=57) {
			//System.out.println("Digit");
			return "digit";
		}
		else {
			//System.out.println("Special Symbol");
			return "special Symbol";
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DetermineChar char1=new DetermineChar();
		char i ;// variable to hold char
		System.out.println("Enter character");
		Scanner s=new Scanner(System.in);
		i=s.next().charAt(0);
		character(i);
		System.out.println(character(i));
		
	}
}
