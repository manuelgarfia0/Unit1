package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int num;
		int num2;
		int remainder;
		int toBeMultiple;
		// Introduce number
		System.out.println("Introduce a number: ");
		num = sc.nextInt();
		System.out.println("Introduce another number");
		num2 = sc.nextInt();
		// Calculate numbers left to be multiple of num2
		remainder = num % num2;
		toBeMultiple = num2 - remainder;
		// Show data
		System.out.println(num + " + " + toBeMultiple + " = " + (num + toBeMultiple) + " is multiple of " + num2);

	}

}
