package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercise: Lower than medium of values.");
		System.out.print("How much numbers will be input? ");
		
		int quantity = sc.nextInt();
		double[] vect = new double[quantity];
		double[] belowMedium = new double[quantity];
		int belowCounter = 0;
		double sum= 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Input a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double medium = sum/vect.length;
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < medium) {
				belowMedium[belowCounter] = vect[i];
				belowCounter++;
			}
		}
		
		System.out.println();
		System.out.printf("Medium of numbers: %.3f\n", medium);
		System.out.println("Values below medium: ");
		
		
		for(int i = 0; i < belowCounter; i++) {
			System.out.println(belowMedium[i]);
		}
		
		sc.close();
	}
}
