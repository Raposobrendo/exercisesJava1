package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numbers;
		double sum = 0, medium;
		
		System.out.print("How many numbers will you input? ");
		numbers = sc.nextInt();
		double vect[] = new double[numbers];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Input a number: ");
			double num = sc.nextDouble();
			vect[i] = num;
			sum += num;
		}
		
		System.out.println();
		System.out.print("Values: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
				
		System.out.printf("\nSum: %.2f", sum);
		
		medium = sum / vect.length; 
		System.out.printf("\nMedium: %.2f", medium);
		
		sc.close();
	}
}
