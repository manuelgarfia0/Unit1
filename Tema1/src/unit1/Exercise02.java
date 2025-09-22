package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);
		// Declaration of the variables
		int edad;
		int edadProximoAño;
		// Ask user to introduce his age
		System.out.println("Introduce tu edad: ");
		edad = scanner.nextInt();
		// Calculate the age of the user next year
		edadProximoAño = edad + 1;
		// Show the age of the user next year
		System.out.println("El año que viene tendras " + edadProximoAño);
		// Close scanner
		scanner.close();
	}

}
