package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variable
		boolean resultado;
		// Ask age to the user
		System.out.print("Ingresa tu edad: ");
		int edad = scanner.nextInt();
		//
		resultado = edad >= 18;
		// Show true if is of legal age or false if isn't of legal age
		System.out.println(resultado);
		// Close scanner
		scanner.close();

	}

}
