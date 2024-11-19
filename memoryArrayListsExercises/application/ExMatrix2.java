package application;

import java.util.Scanner;

public class ExMatrix2 {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		
		int row, column;
		
		System.out.print("Choose the quantity of rows of a matrix: ");
		row = sc.nextInt();
		System.out.print("Choose the quantity of columns of a matrix: ");
		column = sc.nextInt();
		int[][] mat = new int[row][column];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Input position [%d][%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Select a number to show the neighbors: ");
		int neighbors = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == neighbors) {
					System.out.printf("Position [%d][%d]:\n", i, j);
					if(j-1 >= 0) {
						System.out.printf("Left: %d\n", mat[i][j-1]);
					}
					if(j+1 < mat[i].length) {
						System.out.printf("Right: %d\n", mat[i][j+1]);
					}
					if(i-1 >= 0) {
						System.out.printf("Up: %d\n", mat[i-1][j]);
					}
					if(i+1 < mat[i].length) {
						System.out.printf("Down: %d\n", mat[i+1][j]);
					}					
				}
			}
		}
		
		
		sc.close();
	}
}
