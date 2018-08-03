package com.stackroute.practiceexercises;
import java.util.Scanner;

public class EvenorOdd {
	public static String checkEvenorOdd(int number) {
		String str="";
		
		if ( number % 2 == 0) // To check even
	      {
	          if(number>=20 && number<=30)
	         str= "Jerry";
	      }
	      else if(number>20 && number<30)
	         str= "Tom";	
	      else
	       str= "out of range";
		return str;
	    	  
	}
	public static void main(String args[])
	   {
	    Scanner integer=new Scanner(System.in);  
	    
	      System.out.println("Enter an integer between 20 to 30 to check if it is odd or even ");
	      int number=integer.nextInt();
	      
	      System.out.println(checkEvenorOdd(number));
	      
	     
	      
	   }

}
