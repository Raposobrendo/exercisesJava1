package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity, negNumber = 0;
		
		System.out.print("Enter quantity of numbers and we wil show the negative ones: ");
		quantity = sc.nextInt();
		int[] vect = new int[quantity];
		int[] negative = new int[quantity];
		
		for(int i = 0; i < vect.length; i ++) {
			System.out.printf("Enter #%d: ", (i+1));
			int num = sc.nextInt();
			vect[i] = num;
			if(vect[i] < 0) {				
				negative[negNumber] = num;
				negNumber++;
			}
		}
		
		System.out.println("\nNegative numbers: ");
		for(int i = 0; i < negNumber; i++) {
			System.out.printf("%d\n", negative[i]);
		}
		
		sc.close();
	}
}
