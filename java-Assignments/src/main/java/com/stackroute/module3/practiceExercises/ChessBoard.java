package com.stackroute.module3.practiceExercises;

public class ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dim = 8;
//		for (int i = 0; i < dim * dim; i++)
//			System.out.print((i % dim == 0 ? "\n" : "") + ((i / dim) % 2 == 0 ? i % 2 == 0 ? "BB" : "WW" : i % 2 == 0 ? "WW" : "BB") + "|");
//	}
		String chess[][]=new String [8][8];
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if((i+j)%2==0) {
					chess[i][j]="WW|";
					System.out.print(chess[i][j]);
				}
				else
				{
					chess[i][j]="BB|";
					System.out.print(chess[i][j]);
					
				}
			}
			System.out.println();
		}

}
}
