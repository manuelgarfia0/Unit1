package part1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);
		// Declaration of the variables
		int grade1;
		int grade2;
		double mean;
		// Ask the user to introduce data
		System.out.println("Introduce first grade: ");
		grade1 = scanner.nextInt();
		System.out.println("Introduce second grade: ");
		grade2 = scanner.nextInt();
		// Calculate the arithmetic mean between 2 grades
		mean = (double) (grade1 + grade2) / 2;
		// Show the mean
		System.out.println("Your mean is " + mean);
		// Close scanner
		scanner.close();
	}

}
