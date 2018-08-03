package com.stackroute.module2.practiceExercises;

import java.util.Scanner;

import com.stackroute.practiceexercises.Stringreverse;

public class CheckStringPalindrome {
	public static void main(String[] args) {
		//CheckStringPalindrome string=new CheckStringPalindrome();
		 String input = "";
	        Scanner str = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	        input = str.nextLine();
	        System.out.println(isPalindrome(input));        
	        	        
	}

	public static boolean isPalindrome(String input) {
		String reverseString="";
		int n = input.length();
        for(int i = n - 1; i >= 0; i--)
        {
            reverseString = reverseString + input.charAt(i);
        }
       
        if(input.equalsIgnoreCase(reverseString))
        
           return true;
        
        else
        
            return false;
        
	
	
}
}
