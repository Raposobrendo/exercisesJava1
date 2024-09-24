package exercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] Args) {
		Ex3.ex3();
	}

	public static void ex1() {
		Scanner sc1 = new Scanner(System.in);

		int tent, senha = 2002;

		System.out.println("Digite uma senha até que ela seja válida: ");
		tent = sc1.nextInt();

		while (tent != senha) {
			System.out.println("Senha inválida, tente novamente: ");
			tent = sc1.nextInt();
		}

		System.out.println("Acesso permitido.");

		sc1.close();
	}

	public static void ex2() {
		Scanner sc2 = new Scanner(System.in);
		int x, y;

		System.out.println(
				"Digite dois números, e mostraremos qual quadrante se encontra, se digital algum número 0, acabará o programa: ");
		x = sc2.nextInt();
		sc2.nextLine();
		y = sc2.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro.");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo.");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro.");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto.");
			} else {
				System.out.println("");
			}
			x = sc2.nextInt();
			sc2.nextLine();
			y = sc2.nextInt();
		}

		sc2.close();
	}

	public static void ex3() {
		Scanner sc3 = new Scanner(System.in);
		
		int comb, x = 0, y = 0, z = 0;
		
		System.out.println("Olá, digite uma das opções para abastecer ou sair:");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Sair");
		comb = sc3.nextInt();
		
		while(comb != 4) {
			if(comb == 1) {
				x += 1;
				System.out.println("Obrigado, digite mais uma opção:");
				comb = sc3.nextInt();
			}
			else if(comb == 2) {
				y += 1;
				System.out.println("Obrigado, digite mais uma opção:");
				comb = sc3.nextInt();
			}
			else if(comb == 3) {
				z += 1;
				System.out.println("Obrigado, digite mais uma opção:");
				comb = sc3.nextInt();
			}
			else{
				System.out.println("Opção inválida, digite novamente");
				comb = sc3.nextInt();				
			}
		}
		System.out.println("Muito obrigado!");
		System.out.printf("Álcool: %d \n", x);
		System.out.printf("Gasolina: %d\n", y);
		System.out.printf("Diesel: %d", z);
	
		sc3.close();
	}
}
