package com.stackroute.module5.practiceExercise;
import java.util.*;

public class UpdateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Apple");
		  list_Strings.add("Grape");
		  list_Strings.add("Melon");
		  list_Strings.add("Berry");
		  System.out.println("Input: "+list_Strings);
		  list_Strings.set(0, "Kiwi");
		  list_Strings.set(2, "Mango");
		  System.out.println("Output: "+list_Strings);
		  
	}

}
