package part1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int pesetas;
		double euros;
		// Ask data to user
		System.out.println("Introduce a quantity of pesetas: ");
		pesetas = scanner.nextInt();
		// Calculate pesetas to euros
		euros = (double) pesetas / 166;
		// Show data
		System.out.println("You have " + euros + " euros");
		// Close scanner
		scanner.close();
	}

}
