package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		String programTitle = "PSEUDOCODE";
		double price;
		double tax;
		// Display program title
		System.out.println(programTitle);
		// Display prompt for price
		System.out.println("Enter price: ");
		// Enter price
		price = scanner.nextDouble();
		// Display prompt for tax
		System.out.println("Enter tax: ");
		// Enter tax
		tax = scanner.nextDouble();
		// SET price TO price * (1 + tax / 100)
		price = price * (1 + tax / 100);
		// Display new price
		System.out.println(price);
		// Close scanner
		scanner.close();

	}

}
