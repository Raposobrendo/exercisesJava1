package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] Args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the quantity of people to set heigth and gender: ");
		int quantity = sc.nextInt();
		double[] heigths = new double[quantity];
		char[] genders = new char[quantity];
		double highest = 0;
		double lowest = 0;
		double averageHeigthFemale = 0;
		int femaleCounter = 0;
		int maleCounter = 0;
		
		for(int i = 0; i < heigths.length; i++) {
			System.out.printf("Heigth #%d: ", (i+1));
			double heigth = sc.nextDouble();
			heigths[i] = heigth;
			System.out.printf("Gender #%d (m/f): ", (i+1));
			char gender = sc.next().charAt(0);
			genders[i] = gender;
			if(heigths[i] < lowest || lowest == 0) {
				lowest = heigths[i];
			}
			if(heigths[i] > highest || highest == 0) {
				highest = heigths[i];
			}
			if(genders[i] == 'F' || genders[i] == 'f') {
				averageHeigthFemale += heigths[i];
				femaleCounter++;
			}
			else if(genders[i] == 'M' || genders[i] == 'm') {
				maleCounter++;
			}
		}
		
		averageHeigthFemale = averageHeigthFemale/femaleCounter;
		
		System.out.printf("Highest: %.2f\n", highest);
		System.out.printf("Lowest: %.2f\n", lowest);
		System.out.printf("Averrage female heigth: %.2f\n", averageHeigthFemale);
		System.out.printf("Male counter: %d", maleCounter);
		
		
		
		
		
		
		sc.close();
	}
}
