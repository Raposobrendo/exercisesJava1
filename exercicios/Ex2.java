package exercicios;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] Args) {
		Ex2.ex5();
	}
	
	public static void ex1(){
		Scanner sc1 = new Scanner(System.in);
		double x;
		System.out.println("Digite um número para descobrirmos se é par ou impar");
		x = sc1.nextDouble();
		if(x % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		sc1.close();
	}
	
	public static void ex2() {
		Scanner sc2 = new Scanner(System.in);
		
		double x, y;
		System.out.println("Digite dois números para verificarmos se são múltiplos: ");
		x = sc2.nextDouble();
		y = sc2.nextDouble();
		
		if(x % y == 0 || y % x == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		sc2.close();
	}
	
	public static void ex3() {
		Scanner sc3 = new Scanner(System.in);
		int inic, fim, dur;
				
		System.out.println("Digite a hora de inicio e fim de um jogo, para sabermos o quanto durou: ");
		System.out.print("Início: ");
		inic = sc3.nextInt();		
		while(inic > 24) {
			System.out.println("Valor inválido, digite novamente: ");
			inic = sc3.nextInt();
		}		
		System.out.print("Fim: ");
		fim = sc3.nextInt();
		while(fim > 24) {
			System.out.println("Valor inválido, digite novamente: ");
			inic = sc3.nextInt();
		}
		if(fim > inic){
			dur = fim - inic;
			System.out.printf("O jogo durou: %d horas", dur);
		}
		else if(inic > fim){
			dur = (24 - inic) + fim;
			System.out.printf("O jogo durou: %d horas", dur);
		}
		else{
			System.out.printf("O jogo durou: 24 horas");
		}
		sc3.close();		
	}
	
	public static void ex4(){
		Scanner sc4 = new Scanner(System.in);
		int cod, qtd;
		double preFinal;
		
		System.out.println("Digite o código do produto e quantidade para mostrarmos o valor final");
		System.out.println("1----Cachorro quente----R$ 4,00");
		System.out.println("2----X-Salada-----------R$ 4,50");
		System.out.println("3----X-Bacon------------R$ 5,00");
		System.out.println("4----Torrada Simples----R$ 2,00");
		System.out.println("5----Refrigerante-------R$ 1,50");
		System.out.println("Código: ");
		cod = sc4.nextInt();
		while(cod < 1 || cod > 5){
			System.out.println("Código inválido, digite novamente: ");
			cod = sc4.nextInt();
		}
		System.out.println("Quantidade: ");
		qtd = sc4.nextInt();
		while(qtd <1) {
			System.out.println("Quantidade inválida, digite novamente: ");
			qtd = sc4.nextInt();
		}
				
		if(cod == 1) {
			preFinal = (double) qtd * 4;
			System.out.printf("Valor total: %.2f", preFinal);
		}
		if(cod == 2) {
			preFinal = (double) qtd * 4.5;
			System.out.printf("Valor total: %.2f", preFinal);
		}
		if(cod == 3) {
			preFinal = (double) qtd * 5;
			System.out.printf("Valor total: %.2f", preFinal);
		}
		if(cod == 4) {
			preFinal = (double) qtd * 2;
			System.out.printf("Valor total: %.2f", preFinal);
		}
		if(cod == 5) {
			preFinal = (double) qtd * 1.5;
			System.out.printf("Valor total: %.2f", preFinal);
		}
		
		sc4.close();
	}
	
	public static void ex5() {
		Scanner sc5 = new Scanner(System.in);
		double sal, imp;
		
		System.out.println("Digite seu salário e calcularemos o quanto deve pagar de imposto de renda: ");
		sal = sc5.nextDouble();
		while(sal < 0) {
			System.out.println("Digite uma renda válida: ");
			sal = sc5.nextDouble();
		}
		
		if(sal <= 2000) {
			System.out.println("Isento.");
		}
		else if (sal > 2000 && sal <= 3000) {
			imp = (sal - 2000) * 0.08;
			System.out.printf("Imposto cobrado: R$%.2f.", imp);
		}
		else if (sal > 3000 && sal <= 4500) {
			imp = 80 + (sal - 3000) * 0.18;
			System.out.printf("Imposto cobrado: R$%.2f.", imp);
		}
		else {
			imp = 350 + (sal - 4500) * 0.28;
			System.out.printf("Imposto cobrado: R$%.2f.", imp);
		}
	}
}
