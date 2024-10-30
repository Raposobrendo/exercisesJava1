package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Person;

public class Ex3 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int people, age, lessThan16Counter = 0;
		String name;
		double heigth, mediumHeigth = 0;

		System.out.print("Input how many people? ");
		people = sc.nextInt();
		Person[] person = new Person[people];
		String[] lessThan16 = new String[people];

		for (int i = 0; i < person.length; i++) {
			System.out.printf("Data of person #%d: \n", (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Age: ");
			age = sc.nextInt();
			System.out.print("Heigth: ");
			heigth = sc.nextDouble();
			person[i] = new Person(name, age, heigth);
			mediumHeigth += heigth;
			if (age < 16) {				
				lessThan16[lessThan16Counter] = person[i].getName();
				lessThan16Counter++;
			}
		}
		
		System.out.println();
		mediumHeigth = mediumHeigth/person.length;
		System.out.printf("Medium heigth: %.2f\n", mediumHeigth);
		
		double lessThan16Medium = ((double)lessThan16Counter/person.length) * 100;
		System.out.printf("People below 16 years: %.2f%%\n", lessThan16Medium);
		
		for(int i = 0; i < lessThan16Counter; i++) {
			System.out.println(lessThan16[i]);
		}

		sc.close();
	}
}