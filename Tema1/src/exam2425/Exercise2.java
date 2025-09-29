package exam2425;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Initialize constants
		final double LESS_THOUSAND = 0.1;
		final double OVER_THOUSAND = 0.15;
		// Declare variables
		int hours;
		double pricePerHour;
		double grossSalary;
		double netSalary;
		double discount;

		// Ask data to user
		System.out.println("Introduce how many hours do you work: ");
		hours = scanner.nextInt();
		System.out.println("Introduce how many money do you win per hour: ");
		pricePerHour = scanner.nextDouble();
		// Calculate total price
		grossSalary = hours * pricePerHour;
		// Calculate discount
		discount = grossSalary < 1000 ? LESS_THOUSAND : OVER_THOUSAND;
		// Calculate net salary
		netSalary = grossSalary - grossSalary * discount;
		// Show data
		System.out.println(netSalary);
		// Close scanner
		scanner.close();
	}

}
