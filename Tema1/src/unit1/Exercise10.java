package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int number;
		boolean even;
		// Ask data to user
		System.out.println("Introduce a number: ");
		number = scanner.nextInt();
		// Check if number is even
		even = number % 2 == 0;
		// Show true if its even or false if its odd
		System.out.println(even);
		// Close scanner
		scanner.close();
	}

}
