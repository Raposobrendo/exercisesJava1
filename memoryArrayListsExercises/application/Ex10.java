package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Student;

public class Ex10 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input quantity of students to get name, grades 1 and 2. We'll show who is approved (Medium = 6): ");
		int quantity = sc.nextInt();
		Student[] student = new Student[quantity];
		String[] approved = new String[quantity];
		int approvedCount = 0;
		
		for(int i = 0; i < student.length; i++) {
			System.out.printf("Name #%d: ", (i + 1));
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.print("Grade 1: ");
			double grade1 = sc.nextDouble();
			System.out.print("Grade 2: ");
			double grade2 = sc.nextDouble();
			student[i] = new Student(name, grade1, grade2);
			if(student[i].medium() >= 6) {
				approved[approvedCount] = student[i].getName();
				approvedCount++;
			}
		}

		for(int i = 0; i < approvedCount; i++) {
			System.out.println(approved[i]);
		}
				
		sc.close();
	}
}
