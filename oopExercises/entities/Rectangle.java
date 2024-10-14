package entities;

public class Rectangle {
	public double heigth;
	public double width;
	
	public double area() {
		return heigth * width;
	}
	
	public double perimeter() {
		return 2 * (heigth + width);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}
	
	public String toString() {
		return "AREA: " + this.area() + "\nPERIMETER: " + this.perimeter() + "\nDIAGONAL: " + this.diagonal();
	}
}
