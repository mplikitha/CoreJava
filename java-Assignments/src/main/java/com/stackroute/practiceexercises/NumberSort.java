package com.stackroute.practiceexercises;
import java.util.Scanner;


	public class NumberSort {
		public static void main(String[] args) {
			try {
				NumberSort nSort = new NumberSort();
				System.out.println("Enter a number: ");
				Scanner sc = new Scanner(System.in);
				int num=sc.nextInt();
				System.out.println(nSort.numberSort(num));
				sc.close();
			}
			catch(Exception e) {
				System.out.println("Invalid Number");
			}
		}
		
		public String numberSort(int num) {
			int i=0;
			int rem=0;
			int sum = 0;
			int temp=0;
			int result=0;
			int arr[]=new int[(int)(Math.log10(num)+1)];
			while(num>0) {
				rem= num%10;
				if(rem%2==0) {
					sum += rem;
				}
				arr[i]=rem;
				num=num/10;
				i++;
			}
		    int n = arr.length;
		    for (int x = n-1; x>=0 ; x--){
		        for (int y = i-1; y>=0; y--)
		        	if (arr[x] > arr[y]) {
		        		temp = arr[y];
		        		arr[y]=arr[x];
		        		arr[x]=temp;
		        	}       
		    }
		    for(int z=arr.length-1;z>=0;z--) {
		    	result += arr[z]*Math.pow(10, n-1);
		    	n--;
		    }
		    String bool= (sum>15)?"True":"False";
		    String output = "Sorted number in non-increasing order: "+result+"\nSum of even number: "+sum+"\n"+bool;
		    return output;
		}
	}