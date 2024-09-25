package exercicios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] Args) {
			Ex4.ex3();
	}
	
	public static void ex1() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 1000 e mostraremos todos os números ímpares: ");
		int num = sc1.nextInt();
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}				
		}
		
		sc1.close();
	}
	
	public static void ex2() {
		Scanner sc2 = new Scanner(System.in);
		int lim, in = 0, out = 0, num;
		
		
		System.out.println("Digite uma quantidade de números a inserir, mostraremos quantos estão entre 10 e 20");
		lim = sc2.nextInt();
		
		for(int i = 0; i < lim; i++) {
			num = sc2.nextInt();
			if(num >= 10 && num <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.printf("In: %d\nOut: %d", in, out);
		sc2.close();
	}
	
	public static void ex3() {
		Scanner sc3 = new Scanner(System.in);
		
		double num1, num2, num3, media;
		int rep;
		System.out.println("A quantidade de vezes que digitaremos três números e faremos a média desses números com peso 2, 3 e 5 respectivamente: ");
		rep = sc3.nextInt();
		
		for(int i = 0; i < rep; i++) {
			System.out.println("Digite os três números");
			
			num1 = sc3.nextDouble();
			num2 = sc3.nextDouble();
			num3 = sc3.nextDouble();
			sc3.nextLine();
			
			media = (num1*2 + num2*3 + num3*5) / 10;
			
			System.out.printf("Média ponderada: %.1f\n", media);
		}
		
		sc3.close();
	}
}
