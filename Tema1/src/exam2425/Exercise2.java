package exam2425;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int hours;
		double pricePerHour;
		double totalPrice;
		double discount;

		// Ask data to user
		System.out.println("Introduce how many hours do you work: ");
		hours = scanner.nextInt();
		System.out.println("Introduce how many money do you win per hour: ");
		pricePerHour = scanner.nextDouble();
		// Calculate total price
		totalPrice = hours * pricePerHour;
		// Calculate discount
		discount = totalPrice < 1000 ? 1.1 : 1.5;
		totalPrice *= discount;
		// Show data
		System.out.println(totalPrice);
		// Close scanner
		scanner.close();
	}

}
