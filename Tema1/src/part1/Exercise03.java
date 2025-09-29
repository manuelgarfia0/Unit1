package part1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);
		// Declaration of the variables
		int actualYear;
		int birthYear;
		int age;
		// Ask the user to introduce data
		System.out.println("Introduce the actual year: ");
		actualYear = scanner.nextInt();
		System.out.println("Introduce your birth year: ");
		birthYear = scanner.nextInt();
		// Calculate his age by the actual year and user's birth year
		age = actualYear - birthYear;
		// Show user's age
		System.out.println("You are " + age + " years old");
		// Close scanner
		scanner.close();
	}

}
