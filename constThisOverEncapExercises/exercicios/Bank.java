package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int account;
		String holder;
		double balance = 0;
		char initialDeposit;
		double initialValue;
		double valueChange;
				
		System.out.print("Enter account number: ");
		account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		initialDeposit = sc.next().charAt(0);
		while(initialDeposit != 'y' && initialDeposit != 'n') {
			System.out.print("Invalid option, please choose if will have initial deposit (y/n): ");
			initialDeposit = sc.next().charAt(0);
		}
		
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialValue = sc.nextDouble();
			balance += initialValue;
			System.out.println();
		}
		else {
			System.out.println();
		}
		
		Account client = new Account(account, holder, balance);
		
		System.out.println("Account Data: \n" + client);
		
		System.out.print("Enter a deposit value: ");
		valueChange = sc.nextDouble();
		client.depositValue(valueChange);
		System.out.println();
		
		System.out.print("Updated account data: \n" + client + "\n");
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		valueChange = sc.nextDouble();
		client.withdrawValue(valueChange);
		System.out.print("Updated account data: \n" + client + "\n");
		
		
		sc.close();
	}
}
