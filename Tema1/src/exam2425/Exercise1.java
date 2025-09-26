package exam2425;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int num1;
		int num2;
		int num3;
		double mean;
		// Ask data to user
		System.out.println("Introduce a number: ");
		num1 = scanner.nextInt();
		System.out.println("Introduce a number: ");
		num2 = scanner.nextInt();
		System.out.println("Introduce a number: ");
		num3 = scanner.nextInt();
		// Calculate the mean
		mean = (double) (num1 + num2 + num3) / 3;
		// Show the mean
		System.out.println(mean);
		// Close scanner
		scanner.close();
	}

}
