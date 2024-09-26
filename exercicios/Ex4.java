package exercicios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] Args) {
			Ex4.ex7();
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
		
		
		System.out.println("Digite uma quantidade de números a inserir, mostraremos quantos estão entre 10 e 20: ");
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
	
	public static void ex4() {
		Scanner sc4 =  new Scanner(System.in);
		
		int nums;		
		double num1, num2, divi;
		
		System.out.println("Digite a quantidade de vezes que deseja realizar uma divisão: ");
		nums = sc4.nextInt();
		
		for(int i = 0; i < nums; i++) {
			System.out.println("Digite os dois números para a divisão: ");
			num1 = sc4.nextInt();
			num2 = sc4.nextInt();
			if(num2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				divi = num1/num2;
				System.out.printf("Resutado: %.2f", divi);
			}
		}
		
		sc4.close();
	}
	
	public static void ex5() {
		Scanner sc5 = new Scanner(System.in);
		
		int num = 1, rep;
		
		System.out.println("Digite um número para mostrarmos seu fatorial: ");
		rep = sc5.nextInt();
		
		for(int i = rep; i > 1; i--){
			num *= i;			
		}
		
		System.out.println(num);
		sc5.close();
	}
	
	public static void ex6() {
		Scanner sc6 = new Scanner(System.in);
		double num;
		
		System.out.println("Digite um número e mostraremos todos seus divisores: ");
		num = sc6.nextDouble();
		
		for (int i = 0; i <= num; i++) {
			if(num % i == 0){
				System.out.println(i);
			}
		}
		
		sc6.close();
	}
	
	public static void ex7() {
		Scanner sc7 = new Scanner(System.in);
		
		int num, num1, num2, num3;
		System.out.println("Digite um número e mostraremos o quadrado e o cubo desse valor: ");		
		num = sc7.nextInt();
		
		for(int i = 1; i <= num; i++) {
			num1 = i;
			num2 = i * i;
			num3 = num2 * i;
			System.out.printf("%d - %d - %d\n", num1, num2, num3);
		}
		
		sc7.close();
	}
}
