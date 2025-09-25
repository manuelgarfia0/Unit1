package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		final double priceKApple = 2.35;
		final double priceKPears = 1.95;
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
		applePrice = appleK * priceKApple;
		pearPrice = pearK * priceKPears;
		// Show data
		System.out.println("You gain " + applePrice + "€ in apples and " + pearPrice + "€ in pears");
		// Close scanner
		scanner.close();

	}

}
