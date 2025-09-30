package part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int remainder;
		int toSeven;
		// Introduce number
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		// Calculate numbers left to be multiple of 7
		remainder = num % 7;
		toSeven = remainder != 0 ? 7 - remainder : 0;
		// Show data
		System.out.println(num + " + " + toSeven + " = " + (num + toSeven) + " is multiple of 7");
		// Close scanner
		sc.close();

	}

}
