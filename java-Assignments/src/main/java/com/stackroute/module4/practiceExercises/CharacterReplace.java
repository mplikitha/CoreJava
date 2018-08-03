package com.stackroute.module4.practiceExercises;

import java.util.Scanner;

public class CharacterReplace {
	public static void main(String[] args)
    {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter String");
        String str=input.nextLine();

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');
       String new_str1=new_str.replace('l', 't');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str1);
    }
}

