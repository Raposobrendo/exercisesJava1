package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] Args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a quantity of numbers to calculate the medium of the even numbers: ");
		int quantity = sc.nextInt();		
		int[] vect = new int[quantity];
		int[] even = new int[quantity];
		int evenCounter = 0;
		int medium = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();
			vect[i] = num;
			if(num % 2 == 0) {
				even[evenCounter] = num;
				evenCounter++;
			}
		}
		
		
		if(evenCounter <= 0) {
			System.out.println("No even number.");
		}
		else {
			for(int i = 0; i < evenCounter; i++) {
				medium += even[i];
			}
			medium = medium/evenCounter;
			System.out.printf("Medium of even numbers: %d", medium);
		}
			
		sc.close();
	}
}
