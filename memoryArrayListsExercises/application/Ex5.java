package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] Args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercise: Highest number and it's position!!!");
		System.out.print("How many numbers to input? ");
		int quantity = sc.nextInt();
		double[] vect = new double[quantity];
		double highest = 0;
		int index = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Input a number: ");
			double num = sc.nextDouble();
			vect[i] = num;
			if(num >= highest || highest == 0) {
				highest = num;
				index = i;
			}
		}
		
		System.out.println();
		System.out.print("Highest value: " + highest);
		
		System.out.println();
		System.out.print("Index of highest value: " + index);
		
		
		
		
		
		sc.close();
	}
}
