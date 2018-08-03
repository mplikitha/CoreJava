package com.stackroute.module2.practiceExercises;

import java.util.Scanner;

public class CheckPowerOf4 {
	public static boolean isPowerOfFour(int num) {
	    while(num>0){
	        if(num==1){
	            return true;
	        }
	 
	        if(num%4!=0){
	            return false;
	        }else{
	            num=num/4;
	        }
	    }
	 
	    return false;
	}
 
    
    public static void main(String[] args)
    {
    	Scanner number = new Scanner(System.in);
    	System.out.println("Enter number");
        int test_no;
        test_no=number.nextInt();
        /*if(isPowerOfFour(test_no) == 1)
         System.out.println(test_no +  " is a power of 4");
        else
         System.out.println(test_no + " is not a power of 4");
    }*/
        System.out.println(isPowerOfFour(test_no));
        
    }

}
