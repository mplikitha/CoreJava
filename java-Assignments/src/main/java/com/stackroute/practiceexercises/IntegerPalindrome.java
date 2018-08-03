package com.stackroute.practiceexercises;
import java.util.Scanner;

public class IntegerPalindrome {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a number to check if the number is Palindrome or not: ");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			IntegerPalindrome palindrome = new IntegerPalindrome();
			String result = palindrome.palindromeCheck(number);
			System.out.println(result);
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Invalid Number");
		}
	}
	
	
	public String palindromeCheck(int number) {
		int num=number;
		int sum=0;
		int rem=0;
		int res=0;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				sum+=rem;
			}
			res =res*10+rem;
			num=num/10;			
		}
		if(res==number) {
			if(sum>25)
				return number+" is palindrome and the sum of even numbers is greater than 25";
			return number+" is palindrome and the sum of even numbers is less than 25";
		}
		return number+" is not palindrome";
	}
}