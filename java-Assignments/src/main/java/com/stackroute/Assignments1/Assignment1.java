package com.stackroute.Assignments1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a = new Assignment1();

		String str;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		str = s.nextLine();
		a.stringSplit(str);
		System.out.println("file name: "+a.filename(str));

		System.out.println(a.beforeWhere(str));
		System.out.println(a.afterWhere(str));
		System.out.println(a.condition(str));
		a.operators(str);
	}

	public static void stringSplit(String str) {
		String[] st = str.split("\\s");
		
		
		for (String s1 : st) {
			System.out.println(s1);
		}
		
		
	}

	// file name

	public static String filename(String str) {
		// String substring1[];
		String substring1[] = str.split("from");
		String substring2[] = substring1[1].split("where", 2);
		//System.out.println("file name: " + substring2[0]);
		//System.out.println("\n");
		return substring2[0];

	}

	// 2
	public static String beforeWhere(String str) {
		String substr[] = str.split("where");

		//System.out.println("output string:" + substr[0]);
		//System.out.println("\n");
		return substr[0];

	}

	// 3
	public static String afterWhere(String str) {
		String substr[] = str.split("where");
		//System.out.println("output string:" + substr[1]);
		//System.out.println("\n");
		return substr[1];
	}

	// 4
	public static String[] condition(String str) {
		String substr[] = str.split("where");
		String substr2[] = substr[1].split("and");
		//System.out.println("Condition 1: " + substr2[0]);
		
		String condstr1="Condition 1: "+substr2[0];
		String condstr2="Condition 2:"+substr2[1];
		//System.out.println("Condition 2: " + substr2[1]);
		return new String[]{condstr1,condstr2 };
		
		//System.out.println("\n");
	}

	// 5
	public static void operators(String str) {

		//
		String s1[] = str.split("where");
		String s2[] = str.split("and");

		for (int j = 0; j < str.length() +1; j++) {
			String condString = s2[j];
			String operator;

			System.out.println("Condition: "+j+1);
			if (j +1 == 1) {
				operator = ">";
			} else if (j +1 == 2) {
				operator = "=";
			} else {
				operator = "";
			}
			// String operator="[>,=]";
			String[] condVarString = condString.split(operator);
			String variable = condVarString[0];
			
			String condOperator = operator;
			String value = condVarString[1];
			System.out.println("variable : " + variable);
			System.out.println("operator : " + condOperator);
			System.out.println("Value : " + value);
		}
	}

}