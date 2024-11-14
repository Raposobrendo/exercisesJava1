package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import listEntities.Employee;
import listEntities.Enterprise;


public class Ex1 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		
		int quantity = sc.nextInt();
		
		for(int i = 0; i < quantity ; i++) {
			System.out.printf("Employee #%d\n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			for(Employee x : employee) {
				while(x.existId(employee, id) == true) {
					System.out.print("Id already exists, choose another one: ");
					id = sc.nextInt();
				}
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employee.add(new Employee(id, name, salary));
		}
				
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer chosenId = sc.nextInt();
		Boolean foundEmployee = false;
		for(Employee x : employee) {
			if(x.getId() == chosenId) {
				System.out.print("Enter the percentage: ");
				Double increase = sc.nextDouble();
				x.increaseSalary(increase);
				foundEmployee = true;
			}			
		}
		
		if(foundEmployee = false) {
			System.out.println("This id does not exist!");
		}
				
		System.out.println("List of employees: ");
		for(Employee x : employee) {
			System.out.println(x);			
		}
		
		
		sc.close();
	}
}
