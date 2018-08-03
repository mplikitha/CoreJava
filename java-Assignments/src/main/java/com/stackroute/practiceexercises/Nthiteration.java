package com.stackroute.practiceexercises;

import java.util.Scanner;

public class Nthiteration {
	String doiteration(int number) {
		String num="";
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(i);
				num+=i;
			}
		}
		return num;
		
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Nthiteration iterate=new Nthiteration();
		int number;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		iterate.doiteration(number);
		}
}
