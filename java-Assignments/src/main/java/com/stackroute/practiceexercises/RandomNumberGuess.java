package com.stackroute.practiceexercises;
import java.util.Scanner;


public class RandomNumberGuess {
	public static void main(String[] args) {
		RandomNumberGuess randomNumberGuess= new RandomNumberGuess();
		boolean bool=false;
		Scanner sc =new Scanner(System.in);
		int random = (int )(Math.random() * 50 + 1);
		try {
			do{
				System.out.println("Guess a number to check the match: ");
				int num=sc.nextInt();
				bool=randomNumberGuess.randomCheck(num,random);
				
			}while(!bool);
		}
		catch(Exception e) {
			System.out.println("Invalid Number");
		}
		sc.close();
	}
	
	
	public boolean randomCheck(int num, int random) {
			if(num>random) {
				System.out.println("Number guessed is more than original number");
				return false;
			}
			else if(num<random) {
				System.out.println("Number guessed is less than original number");
				return false;
			}
			else {
				System.out.println("Number guessed matches the original number");
				return true;				
			}
	}
}


