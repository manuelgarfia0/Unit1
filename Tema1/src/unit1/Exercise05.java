package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);
		// Declaration of the variables
		double radio;
		final double PI = Math.PI;
		double length;
		double area;
		// Ask user for data
		System.out.println("Introduce the radio of the circunference: ");
		radio = scanner.nextDouble();
		// Calculate length of the circunference
		length = 2 * PI * radio;
		// Show length of the circunference
		System.out.println("The length of the circunference is " + length);
		// Calculate area of the circunference
		area = PI * Math.sqrt(radio);
		// Show area of the circunference
		System.out.println("The area of the circunference is " + area);

		// Close scanner
		scanner.close();
	}

}
