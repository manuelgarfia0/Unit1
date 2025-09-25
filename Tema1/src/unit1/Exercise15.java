package unit1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		final double IVA = 21;
		double priceNoIVA;
		double priceIVA;
		// Ask data to user
		System.out.println("Introduce the price: ");
		priceNoIVA = scanner.nextDouble();
		// Apply IVA
		priceIVA = priceNoIVA * (1 + IVA / 100);
		// Show information
		System.out.println("The final price will be: " + priceIVA);

	}

}