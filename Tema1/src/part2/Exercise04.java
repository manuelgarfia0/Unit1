package part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		double y;
		int x;
		int a;
		int b;
		int c;
		// Ask data to user
		System.out.println("Introduce the value of x: ");
		x = sc.nextInt();
		System.out.println("Introduce the value of the letter a: ");
		a = sc.nextInt();
		System.out.println("Introduce the value of the letter b: ");
		b = sc.nextInt();
		System.out.println("Introduce the value of the letter c: ");
		c = sc.nextInt();
		// Calculate ecuation
		y = a * Math.pow(x, 2) + b * x + c;
		// Show the result
		System.out.println("y = " + y);
		// Close scanner
		sc.close();
	}

}
