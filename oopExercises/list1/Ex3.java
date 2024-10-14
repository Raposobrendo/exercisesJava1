package list1;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Ex3 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome de um estudante e suas 3 notas, diremos se passou ou não. (Média = 60).");
		System.out.println("Peso nota 1: 30\nPeso nota 2 e 3: 35");
		Student stu = new Student();
		System.out.print("Digite o nome: ");
		stu.name = sc.nextLine();
		System.out.print("Digite a nota 1: ");
		stu.nota1 = sc.nextDouble();
		while(stu.nota1 < 0 || stu.nota1 > 30) {
			System.out.print("Valor inválido, digite a nota novamente: ");
			stu.nota1 = sc.nextDouble();
		}
		System.out.print("Digite a nota 2: ");
		stu.nota2 = sc.nextDouble();
		while(stu.nota2 < 0 || stu.nota2 > 35) {
			System.out.print("Valor inválido, digite a nota novamente: ");
			stu.nota2 = sc.nextDouble();
		}
		System.out.print("Digite a nota 3: ");
		stu.nota3 = sc.nextDouble();
		while(stu.nota3 < 0 || stu.nota3 > 35) {
			System.out.print("Valor inválido, digite a nota novamente: ");
			stu.nota3 = sc.nextDouble();
		}		
		
		System.out.println(stu);		
		
		sc.close();
	}
}
