package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int age;
		int actualYear;
		int bornYear;
		// Ask user for his age
		System.out.println("Introduce your age: ");
		age = scanner.nextInt();
		// Ask for actual year
		System.out.println("What's the actual year?");
		actualYear = scanner.nextInt();
		// Calculate born year of the user
		bornYear = actualYear - age;
		// Show born year
		System.out.println(bornYear);
		// Close scanner
		scanner.close();

	}

}
