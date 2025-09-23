package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int age;
		boolean legalAge;
		// Ask data to user
		System.out.println("Introduce your age: ");
		age = scanner.nextInt();
		// Check if he is legal age
		if (age >= 18) {
			legalAge = true;
			System.out.println("You are of legal age");
		} else {
			legalAge = false;
			System.out.println("Your aren't of legal age");
		}
		// Close scanner
		scanner.close();
	}

}
