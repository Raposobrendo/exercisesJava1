package list2;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Ex1 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dolar price? ");
		CurrencyConverter.change = sc.nextDouble();
		System.out.print("How many dolars will be bougth? ");
		CurrencyConverter.dolar = sc.nextDouble();
		System.out.print("Amount to be paid in reais: " + CurrencyConverter.amountPaid());
		
		sc.close();;
	}
}
