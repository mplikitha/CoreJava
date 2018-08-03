package com.stackroute.module2.practiceExercises;

public class FactorialofInt {

	
	    
	    public static void main(String[] args)
	    {
      
	        System.out.println("Int factorials:");
	        printIntFactorials();
	        
	        System.out.println("Long factorials:");
	        printLongFactorials();
	    }
	    
	    
	    public static void printIntFactorials()
	    {
	        int i  = 1;
	        int fact = 1;
	        
	        
	        while (true)
	        {
	            System.out.println("The factorial of "+i+" is"+ fact);
	        	
	            if (Integer.MAX_VALUE / fact < (i+1)) {
	                System.out.println("The factorial of "+ (i+1)+ " is out of range.\n");
	            	
	                break;
	            }
	            i++;
	            fact *= i;
	           
	        }
	        
	    }
	    
	    public static void printLongFactorials()
	    {
	        long i  = 1L;
	        long fact = 1L;
	             
	        while (true)
	        {
	        	System.out.println("The factorial of "+i+" is"+ fact);
	        	
	        	
	            if (Long.MAX_VALUE / fact < (i+1)) {
	               System.out.println("The factorial of "+(i+1)+ "is out of range.\n");
	            	
	                break;
	            }
	            i++;
	            fact *= i;
	            
	        }
	       
	    }    
}
