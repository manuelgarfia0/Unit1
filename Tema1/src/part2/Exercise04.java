package part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare constant
		final String y;
		// Declare variables
		int a;
		int b;
		int c;
		// Ask data to user
		System.out.println("Introduce the value of the letter a: ");
		a = sc.nextInt();
		System.out.println("Introduce the value of the letter b: ");
		b = sc.nextInt();
		System.out.println("Introduce the value of the letter c: ");
		c = sc.nextInt();
		// Calculate ecuation
		y = a + "x^2+" + b + "x+" + c;
		// Show y
		System.out.println("y=" + y);
		// Close scanner
		sc.close();
	}

}
