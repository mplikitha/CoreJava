package com.stackroute.module3.practiceExercises;

public class CatchingException {

	public static void main(String[] args) {

		try {
			int size=-4;
			int[] arr=new int[size];
			
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Array can't be negative "+e.getMessage() );
		}
		try {
			int size1=5;
			int[] array=new int[size1];
			System.out.println(array[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds "+e.getMessage());
		}
		try {
			String name=null;
			String[] comma = name.split(",");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception "+e.getMessage());
		}
	}

}
