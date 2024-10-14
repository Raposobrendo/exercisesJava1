package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return nota1 + nota2 + nota3;
	}
	
	public double failed() {
		return 60-media();
	}
	
	public String toString() {
		if(media() >= 60) {
			return "FINAL GRADE = " + media() + "\nPASS";
			
		}
		else {
			return "FINAL GRADE = " + media() + "\nFAILED" + "\nMISSING " + failed() + " POINTS.";
		}
	}
}
