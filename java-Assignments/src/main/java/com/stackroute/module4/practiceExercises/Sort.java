package com.stackroute.module4.practiceExercises;

import java.util.Scanner;

public class Sort {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter text to be sort");
		String text=input.nextLine();
		int count = 0;                                                   
		// Counts number of words
	    boolean isWord = false;                                            
	    // Indicates start of a word found
	    for (int i = 0 ; i < text.length() ; ++i) {
	      if(isWord) {                                                    
	    	  // If we have found a word...
	        if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'')
	          continue;                                                    
	        // ...pass over letters or single quote
	        else                                                           
	        	// It is not a letter or single quote...
	          isWord = false;                                              
	        
	      }
	      else if(Character.isLetter(text.charAt(i))) {
	                                                                      
	    	  // We have the first letter of a new word
	          count++;                                                     
	          //  increment word count
	          isWord = true;                                              
	          // and record we have found a word
	      }
	    }
	 
	    // Create the array of strings to contain all the words:
	    String[] words = new String[count];
	 
	    // Now extract the words from the text
	    int start = 0;                                                    
	    int wordIndex = 0;                                                
	    isWord = false;                                                   
	    for (int i = 0 ; i < text.length() ; ++i) {
	      if(!isWord) {                                                   
	        if(Character.isLetter(text.charAt(i))) {                      
	          start = i;                                                   
	          isWord = true;                                               
	        }
	      }
	      else {                                                           
	        if(Character.isLetter(text.charAt(i)) || text.charAt(i) == '\'')
	          continue;                                                    
	        else {                                                        
	          isWord = false;                                              
	          words[wordIndex++] = text.substring(start,i);                
	        }
	      }
	    }
	    
	    if(wordIndex < words.length)
	      words[wordIndex] = text.substring(start);
	 
	   
	    String temp = null;                                                
	    boolean exchange = true;                                          
	    while(exchange) {
	      exchange = false;                                                
	      for(int i = 1 ; i < words.length ; ++i) {                       
	        if(words[i-1].compareTo(words[i]) > 0) {                       
	          temp = words[i];                                             
	          words[i] = words[i-1];
	          words[i-1] = temp;
	          exchange = true;                                            
	        }
	      }
	    }
	 
	    // Display the sorted array of words:
	    for(String word : words) {
	      System.out.println(word);
	    }
	  }
	
	}


