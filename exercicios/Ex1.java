package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Ex1.ex3();
	}
	
	public static void ex1(){
		System.out.println("Exercício 1:");
		Scanner sc1 = new Scanner(System.in);
		double pi, raio, area;
		
		pi = 3.14159;
		System.out.println("Digite o raio de um círculo e calcularemos sua área: ");
		raio = sc1.nextDouble();
		sc1.nextLine();
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Área do cículo é de %.4f.", area);
		sc1.close();
	}
	
	public static void ex2() {
		System.out.println("Exercício 2:");
		int a, b , c, d;
		double dif;
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Digite 4 números inteiros e diremos quando será o cálculo (A * B - C * D):");
		System.out.print("A: ");
		a = sc2.nextInt();
		sc2.nextLine();
		System.out.print("B: ");
		b = sc2.nextInt();
		sc2.nextLine();
		System.out.print("C: ");
		c = sc2.nextInt();
		sc2.nextLine();
		System.out.print("D: ");
		d = sc2.nextInt();
		sc2.nextLine();
		dif = a*b-c*d;
		
		System.out.printf("Diferença: %.2f", dif);
		
		sc2.close();
	}
	
	public static void ex3() {
		System.out.println("Exercício 3");
		
		Scanner sc3 = new Scanner(System.in);
		int cod1, cod2, qt1, qt2;
		double p1, p2, total;

		System.out.println("Digite o código de um produto, a quantidade e em seguida o preço desejado.");
		cod1 = sc3.nextInt();
		sc3.nextLine();
		qt1 = sc3.nextInt();
		sc3.nextLine();
		p1 = sc3.nextDouble();
		sc3.nextLine();
				
		System.out.println("Digite o código de outro, a quantidade e em seguida o preço desejado.");
		cod2 = sc3.nextInt();
		sc3.nextLine();
		qt2 = sc3.nextInt();
		sc3.nextLine();
		p2 = sc3.nextDouble();
		sc3.nextLine();
				
		total = qt1 * p1 + qt2 * p2;
		System.out.printf("Valor total: %.2f", total);
		sc3.close();
	}
}
