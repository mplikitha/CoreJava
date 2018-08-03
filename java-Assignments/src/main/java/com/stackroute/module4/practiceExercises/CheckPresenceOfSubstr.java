package com.stackroute.module4.practiceExercises;

import java.util.Scanner;

public class CheckPresenceOfSubstr {
	
	public static boolean isSubStringPresent(String inputString,String findString) {
		if(inputString.contains(findString))
			return true;
		else
		return false;
	}
	
	public static void main(String []args) {
		String inputString=null;
		String findString="Harry";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter string ");
		inputString=input.nextLine();
		//System.out.println("enter a subString to be find ");
		//findString=input.nextLine();
		System.out.println("is harry here? "+isSubStringPresent(inputString,findString));
	}
}
