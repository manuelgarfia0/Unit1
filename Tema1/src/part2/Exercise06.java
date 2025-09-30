package part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double milimeters;
		double centimeters;
		double meters;
		double totalCentimeters;
		// Ask data to user
		System.out.println("Introduce a quantity of milimeters: ");
		milimeters = sc.nextDouble();
		System.out.println("Introduce a quantity of centimeters: ");
		centimeters = sc.nextDouble();
		System.out.println("Introduce a quantity of meters: ");
		meters = sc.nextDouble();
		// Calculate distance
		totalCentimeters = centimeters + (milimeters / 10) + (meters * 100);
		// Show distance in centimeters
		System.out.println("Total distance in centimeters: " + (int) totalCentimeters);
		// Close scanner
		sc.close();

	}

}
