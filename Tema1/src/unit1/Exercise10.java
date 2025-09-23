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
		if (number % 2 == 0) {
			even = true;
			System.out.println("Your number is even");
		} else {
			even = false;
			System.out.println("Your number is odd");
		}
		// Close scanner
		scanner.close();
	}

}
