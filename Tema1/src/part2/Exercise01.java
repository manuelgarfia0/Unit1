package part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double num;
		int roundNum;
		// Introduce decimal num
		System.out.print("Introduce a decimal number: ");
		num = sc.nextDouble();
		// Calculate round number
		roundNum = (int) (num + 0.5);
		// Show number rounded
		System.out.println("Number rounded: " + roundNum);
		// Close scanner
		sc.close();
	}

}
