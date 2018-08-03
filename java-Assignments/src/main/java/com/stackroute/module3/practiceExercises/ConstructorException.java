package com.stackroute.module3.practiceExercises;

public class ConstructorException {
	public ConstructorException(String name) {

		System.out.println(name);
	}

	public static void main(String[] args) throws Exception{

		ConstructorException cobj=new ConstructorException("Java");
		try {
			throw new Exception("Exception occurred");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block always gets executed");
		}
		
	}

}
