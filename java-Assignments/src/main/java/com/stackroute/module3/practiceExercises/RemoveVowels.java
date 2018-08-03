package com.stackroute.module3.practiceExercises;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String places[]= {"India","United States","Germany","Egypt","czechoslovakia"};
 char c[]=null;
 int k=0;
for(int i=0; i<places.length;i++) {
	String str=places[i];
	System.out.print(" Place Name without Vowels: "+i+" ");
	for(int j=0;j<str.length();j++) {
		
	if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u') {
			continue;
		}
				System.out.print(str.charAt(j));
		
	}
	
	System.out.println();
}

	}

}
