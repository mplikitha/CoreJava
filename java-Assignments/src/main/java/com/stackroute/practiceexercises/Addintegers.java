package com.stackroute.practiceexercises;
import java.util.Scanner;
// program to add two integers
public class Addintegers {
	
	public  int doAddition(int a[],int n) {
		
        
        int sum=0;
        for(int i=0; i<n; i++){
            
        sum=sum+a[i];
        }

        return sum;

	}
	
	    public static void main(String[] args)
	    {
	    Addintegers add=new Addintegers();
	   Scanner input = new Scanner(System.in);
	   System.out.println("enter number of arguments");
	   int n=input.nextInt();
	    int i = 0;
	    System.out.println("enter the numbers");
	    int a[]=new int[n];
	    while(input.hasNextInt()){
	    	
	        a[i] = input.nextInt();
	        i++;
	        if(i == n){
	            break;
	        }
	    }
	       
	    
	    
	    System.out.println(add.doAddition(a,n));
	    
	
	    }
}

