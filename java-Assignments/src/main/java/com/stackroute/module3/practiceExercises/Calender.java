package com.stackroute.module3.practiceExercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
	public static String calenderDisplay() {
		String str1, str2;
		String result;
		Calendar c = Calendar.getInstance();

	     // Set the calendar to monday of the current week
	     c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

	     // Print dates of the current week starting on Monday
	       DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
	       str1=df.format(c.getTime());
	        for (int i = 0; i <6; i++) {
	         c.add(Calendar.DATE, 1);
	           }
	        str2=df.format(c.getTime());
			//System.out.println();
		result=str1+" "+str2;
		return result;
	}
	public static void main(String []args) {
		System.out.println(calenderDisplay());

	     }
	
	}


