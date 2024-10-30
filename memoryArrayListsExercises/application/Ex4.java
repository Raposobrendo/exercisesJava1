package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How much numbers to input? ");
		int quantity = sc.nextInt();
		int[] numbers = new int[quantity];
		int[] even = new int[quantity];
		int evenCounter = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number: ");
			int num = sc.nextInt();
			numbers[i] = num;
			if (num % 2 == 0) {
				even[evenCounter] = num;
				evenCounter++;
			}
		}
		
		System.out.println();
		System.out.println("Numbers even: ");
		for(int i = 0; i < evenCounter; i++) {
			System.out.printf("%d   ", even[i]);
		}
		
		System.out.println();
		System.out.printf("Quantity of even numbers: %d", evenCounter);

		sc.close();
	}
}
