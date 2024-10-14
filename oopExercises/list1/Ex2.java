package list1;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Ex2 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		
		Employee employee = new Employee();
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase in salary? ");
		double increase = sc.nextDouble();
		employee.increaseSalary(increase);
		System.out.println();
		System.out.println("Updated data: " + employee);
				
		sc.close();
	}
}
