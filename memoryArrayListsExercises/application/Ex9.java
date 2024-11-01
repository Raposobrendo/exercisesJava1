package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the quantity of persons to get name and age, and point out the oldest one: ");
		int quantity = sc.nextInt();
		String[] names = new String[quantity];
		int[] ages = new int[quantity];
		String oldestPerson = "null";
		int oldestAge = 0;
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("Name of the person #" + (i+1) + "\n");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			names[i] = name;
			ages[i] = age;
			if(ages[i] > oldestAge) {
				oldestAge = ages[i];
				oldestPerson = names[i];
			}
		}
		
		System.out.print("Oldest person: " + oldestPerson);		
		
		sc.close();
	}
}
