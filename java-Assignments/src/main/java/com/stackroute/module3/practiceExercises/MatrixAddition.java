package com.stackroute.module3.practiceExercises;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) 
    {
        int row,column;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix:");
        row = input.nextInt();
        System.out.print("Enter number of columns of matrix:");
        column = input.nextInt();
   int a[][] = new int[row][column];
            int b[][] = new int[row][column];
            int c[][] = new int[row][column];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    a[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    b[i][j] = input.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("sum of matrices:");
            for (int i = 0; i < row; i++) 
            {
                for (int j = 0; j < column; j++) 
                {
                    //for (int k = 0; k < column; k++) 
                    
                        c[i][j] = a[i][j] + b[i][j];
                        
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            
        }
        
    }



