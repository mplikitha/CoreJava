package com.stackroute.module2.practiceExercises;

public class Member {
	String Name;
	int age;
	float salary;
	
	 static class Membervariable  {
		 Member object=new Member();
		 void variables(){
			
			object.Name="Harry pot";
			object.age=50;
			object.salary=50000f;
		
		System.out.println("Person Name: "+object.Name);
		System.out.println("Person Age: "+object.age);
		System.out.println("Person Salary: "+object.salary);
		
	
	
	}
	}

	
	public static void main(String args[]){  
		Membervariable obj=new Membervariable();
		obj.variables();
		//member.variables("summit", 40, 6000f);
	
	}
}
	
	
	
	
	

