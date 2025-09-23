package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);
		// Declaration of the variables
		int number1;
		int number2;
		int sum;
		int subtract;
		int multiplication;
		double division;
		// Ask data to the user
		System.out.println("Introduce one number: ");
		number1 = scanner.nextInt();
		System.out.println("Introduce another number: ");
		number2 = scanner.nextInt();
		// Do and show the sum
		sum = number1 + number2;
		System.out.println("Sum of both numbers: " + sum);
		// Do and show the subtraction
		subtract = number1 - number2;
		System.out.println("Subtract of both numbers: " + subtract);
		// Do and show the multiplication
		multiplication = number1 * number2;
		System.out.println("Multiplication of both numbers: " + multiplication);
		// Do and show the division
		division = (double) number1 / number2;
		System.out.println("Division of both numbers: " + division);

		// Close the scanner
		scanner.close();
	}

}
