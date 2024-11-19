package application;

import java.util.Scanner;

public class ExMatrix {
	public static void main(String[] Args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Hi, input a number to make a matrix, we'll show the main diagonal and the quantity of negative numbers: ");
		
		int quantity = sc.nextInt();
		int[][] mat = new int[quantity][quantity];
		int negative = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf("Input position: [%d][%d]: ", i, j);
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					negative++;
				}
			}
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.printf(" %d ", mat[i][j]);
			}
			System.out.println();
		}
		
		/* System.out.print("Main diagonal: ");
		for(int i = 0; i < quantity; i++) {
			for(int j = 0; j < quantity; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		} 
		Not the better way to resolve.
		*/
		
		System.out.print("Main diagonal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}		
		
		System.out.println();
		System.out.print("Quantity negative numbers: ");
		System.out.print(negative);		
		
		sc.close();
	}
}
