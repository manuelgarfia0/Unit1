package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		double appleK;
		double pearK;
		double applePrice;
		double pearPrice;
		// Ask data to user
		System.out.println("How many kilos of apples have you sell?");
		appleK = scanner.nextDouble();
		System.out.println("How many kilos of pears have you sell?");
		pearK = scanner.nextDouble();
		// Calculate the prices
		applePrice = appleK * 2.35;
		pearPrice = pearK * 1.95;
		// Show data
		System.out.println("You gain " + applePrice + "€ in apples and " + pearPrice + "€ in pears");
		// Close scanner
		scanner.close();

	}

}
