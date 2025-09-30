package part2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double meters;
		int centimeters;
		int mToC;
		// Ask data to user
		System.out.println("Introduce the lenght: ");
		meters = sc.nextDouble();
		// Calculate distance in centimeters
		mToC = (meters * 100);
		// Show result
		System.out.println(centimeters);
		// Close scanner
		sc.close();

	}

}
