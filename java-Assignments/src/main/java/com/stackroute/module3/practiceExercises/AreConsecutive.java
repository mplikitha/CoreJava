package com.stackroute.module3.practiceExercises;

import java.util.Scanner;

public class AreConsecutive {
	public boolean ConsecutiveCheck(int[] array) {
		int sum = 0;

		boolean result = true;
		for (int s = 1; s < array.length; s++) {
			//1sum = sum + array[s];

			if (array[s+1] == array[s]) {
				result = true;
				break;
			} else {
				result = false;
				break;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		String inputNum;	
		AreConsecutive consecutiveNumObj = new AreConsecutive();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter digits");
		inputNum = sc.nextLine();
		String[] splitByComma = inputNum.split(",");
		int[] splitByCommaArray = new int[splitByComma.length];
		for (int i = 1; i < splitByComma.length; i++) {

			int num1 = Integer.parseInt(splitByComma[i]);
			int num2 = Integer.parseInt(splitByComma[i - 1]);
			int p = num1 - num2;
			splitByCommaArray[i] = p;
		}
		

		if (consecutiveNumObj.ConsecutiveCheck(splitByCommaArray) == true) {
			System.out.println("consecutive");
		} else
			System.out.println("not consecutive");
	}

}
