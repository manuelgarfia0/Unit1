package unit1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		String name;
		int age;
		// Ask data to user
		System.out.println("Introduce your name: ");
		name = scanner.nextLine();
		System.out.println("Introduce your age: ");
		age = scanner.nextInt();
		// Show message
		System.out.println("Hello " + name + ", you are " + age + " years old.");
		// Close scanner
		scanner.close();

	}

}
