package part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);

		// Declaration of the variable number
		int number;
		// Ask the user to introduce a number
		System.out.println("Introduce a number:  ");
		number = scanner.nextInt();
		// Show the number
		System.out.println("Number introduced: " + number);
		// Close scanner
		scanner.close();
	}

}
