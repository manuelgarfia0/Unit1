package part2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// Create scanner
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int problem;
		int volume;
		// Ask data to user
		System.out.println("Introduce a problem: ");
		problem = sc.nextInt();
		// Calculate the volume of the problem
		volume = (int) problem / 100;
		// Show the volume of the problem
		System.out.println("Your problem is in " + volume + " volume.");
	}

}
