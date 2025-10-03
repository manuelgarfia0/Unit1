package part2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int year;
		int century;
		// Ask data to user
		System.out.println("Introduce a year: ");
		year = sc.nextInt();
		// Calculate the century of the year
		century = (year - 1) / 100 + 1;
		// Show the century
		System.out.println(century);
		// Close scanner
		sc.close();
	}

}
