package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		double height;
		double weight;
		double BMI;
		// Ask data to user
		System.out.println("Introduce your height in meters: ");
		height = scanner.nextDouble();
		System.out.println("Introduce your weight: ");
		weight = scanner.nextDouble();
		// Calculate BMI
		BMI = weight / Math.pow(height, 2);
		// Show data to user
		System.out.println("Your BMI is: " + BMI);
		// Close scanner
		scanner.close();

	}

}
