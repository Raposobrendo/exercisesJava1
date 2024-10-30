package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercise: Sum the numbers of two lists, by index:");
		System.out.print("How much numbers each list will have? ");
		int quantity = sc.nextInt();
		int[] vect1 = new int[quantity];
		int[] vect2 = new int[quantity];
		int[] vect3 = new int[quantity];
		
		System.out.println("Input value of vector 1");		
		for(int i = 0; i < vect1.length; i++) {
			System.out.print("Enter number: ");
			vect1[i] = sc.nextInt();
		}
		
		System.out.println("Input value of vector 2");		
		for(int i = 0; i < vect2.length; i++) {
			System.out.print("Enter number: ");
			vect2[i] = sc.nextInt();
		}
		
		System.out.println("Final vector values");		
		for(int i = 0; i < vect3.length; i++) {
			int num = vect1[i] + vect2[i];
			vect3[i] = num;
			System.out.println(vect3[i]);
		}
				
		sc.close();
	}
}
