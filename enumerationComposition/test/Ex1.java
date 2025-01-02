package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] Args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
				
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter Worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));	
				
		System.out.println("How many contracts to this worker? ");
		Integer contracts = sc.nextInt();			
		
		for (int i = 1; i <= contracts; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		
		
		
		
		
		sc.close();
	}
}
