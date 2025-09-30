package part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constants
		final double CHILD_PRICE = 15.50;
		final double ADULT_PRICE = 20.00;
		// Declare variables
		int numChild;
		int numAdult;
		double priceNoDiscount;
		double finalPrice;
		// Ask data to user
		System.out.print("Introduce a quantity of childs tickets: ");
		numChild = sc.nextInt();
		System.out.print("Introduce a quantity of adults tickets: ");
		numAdult = sc.nextInt();
		// Calculate prices
		priceNoDiscount = (numChild * CHILD_PRICE) + (numAdult * ADULT_PRICE);
		finalPrice = priceNoDiscount >= 100 ? priceNoDiscount * 0.95 : priceNoDiscount;
		// Show data
		System.out.printf("Total price: " + finalPrice + "€");
		// Close scanner
		sc.close();
	}
}
