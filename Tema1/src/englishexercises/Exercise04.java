package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		double pounds;
		double kilos;
		// Prompt for value in pounds
		System.out.println("Introduce pounds: ");
		// Enter value in pounds
		pounds = scanner.nextDouble();
		// Set value to old value / 2.2
		kilos = pounds / 2.2;
		// Display value in kilos
		System.out.println(pounds + " pounds to kilos: " + kilos + "kg");
		// Close scanner
		scanner.close();

	}

}
