package com.stackroute.module2.practiceExercises;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CalculateFrequenceOfWords {
	
		public static void main(String[] args) throws FileNotFoundException {
	        // open the file
	        Scanner console = new Scanner(System.in);
	        
	        System.out.print("Enter the name of file ");
	        String fileName = console.nextLine();
	        Scanner input = new Scanner(new File(fileName));

	        // counting words
	        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
	        while (input.hasNext()) {
	            String next = input.next().toLowerCase();
	            if (!wordCounts.containsKey(next)) {
	                wordCounts.put(next, 1);
	            } else {
	                wordCounts.put(next, wordCounts.get(next) + 1);
	            }
	        }

	        // get frequencies
	     
	       
	        for (String word : wordCounts.keySet()) {
	            int count = wordCounts.get(word);
	           
	                System.out.println(word+ "\t" + count+" times");
	        }
	    }
	}

		