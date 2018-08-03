package com.stackroute.practiceexercises;
import java.util.Scanner;
import java.util.regex.*; 
// program to check user entered character is vowel or consonent
public class StringVowelConsonant {
	public static void main(String[] args) {
		System.out.println("Enter a string to print its vowels and consonants: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringVowelConsonant sVowelConsonant = new StringVowelConsonant();
		System.out.println(sVowelConsonant.StringVowelPrint(s));
		sc.close();
	}
	
	/**Method to check the character is vowel or consonant
	 * @param s
	 */
	public String StringVowelPrint(String s) {
		char ch[]= s.toCharArray();
		String output="";
		String res[] = new String[ch.length];
		for(int i=0; i<ch.length;i++) {
			String x = String.valueOf(ch[i]);
			if(Pattern.matches("[aeiou]", x)){
				res[i]="Vowel";
			}
			else if(Pattern.matches("[bcdfghjklmnpqrstvwxyz]", x)){
				res[i]="Consonant";
			}
			else {
				output += "Invalid letter";
				return output;
			}
		}
		for (String string : res) {
			output += string+" ";
		}
		return output;
	}
	
}