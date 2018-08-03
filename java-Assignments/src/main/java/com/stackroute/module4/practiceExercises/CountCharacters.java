package com.stackroute.module4.practiceExercises;

import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter a character to count in the string " + s);
        char c = sc.next(".").toLowerCase().charAt(0); // This logic is to read
                                                       // only one character
        int cn = countCharacters(s, c, 0, 0);
        System.out.println(c + " occurs " + cn + " times in " + s);
        sc.close();
    }
    private static int countCharacters(String s, char c, int index, int count) {
          if (index < s.length()) {
             if (c == s.charAt(index)) {
                 count++;
             }
             index++;
             count = countCharacters(s, c, index, count);
          }
         return count;
     }
}

