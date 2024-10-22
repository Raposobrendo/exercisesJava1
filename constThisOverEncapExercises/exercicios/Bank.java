package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int account;
		String holder;
		double balance;
		char initialDeposit;
				
		System.out.print("Enter account number: ");
		account = sc.nextInt();
		System.out.print("Enter account holder");
		holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)?");
		initialDeposit = sc.next().charAt(0);
		while(initialDeposit != 'y' || initialDeposit != 'n') {
			System.out.print("Invalid option, please choose if will have initial deposit (y/n)");
			initialDeposit = sc.next().charAt(0);
		}
		
		if(initialDeposit == 'y') {
			
		}
		else if(initialDeposit == 'n') {
			
		}
		else {
			
		}
		
		
		sc.close();
	}
}
