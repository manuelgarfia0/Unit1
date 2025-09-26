package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		boolean rain;
		boolean finishedTasks;
		boolean goLibrary;
		boolean goOut;
		// Ask data to the user
		System.out.print("¿Is it raining? (true/false): ");
		rain = scanner.nextBoolean();
		System.out.print("¿Do you finish your tasks? (true/false): ");
		finishedTasks = scanner.nextBoolean();
		System.out.print("¿Do you need to go to the library? (true/false): ");
		goLibrary = scanner.nextBoolean();
		// Can go out if: (don't rain and finish your tasks) or go to the library
		goOut = goLibrary || (!rain && finishedTasks);

		// Show true if you can go out or false if you can't
		System.out.println("Can you go out? " + goOut);
		// Close scanner
		scanner.close();
	}

}
