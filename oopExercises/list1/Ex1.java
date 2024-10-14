package list1;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Ex1 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle heigth and width: ");
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}
}
