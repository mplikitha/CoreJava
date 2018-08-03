package com.stackroute.practiceexercises;
import java.util.Scanner;
public class Stringreverse {
	String doreverse(String str1) {
		
	      String str2="";
	   
	      for (int i=str1.length()-1; i>=0; i--) {
	        str2 += str1.charAt(i);
	      }
	   
	   return str2;
	   
	   
	    }
	
	public static void main(String[] args) {
	Stringreverse string=new Stringreverse();
	Scanner str = new Scanner(System.in);
	System.out.println("enter string");
String str1 = str.next();
     
	System.out.println(string.doreverse(str1));

}
}
