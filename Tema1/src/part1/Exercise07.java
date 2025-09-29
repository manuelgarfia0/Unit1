package part1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creation of the scanner
		Scanner scanner = new Scanner(System.in);
		// Declaration of variables
		String name;
		String address;
		String phoneNumber;
		// Ask data to user
		System.out.println("Introduce your name: ");
		name = scanner.nextLine();
		System.out.println("Introduce your address: ");
		address = scanner.nextLine();
		System.out.println("Introduce your phone number: ");
		phoneNumber = scanner.nextLine();
		// Show data
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone number: " + phoneNumber);
		// Close scanner
		scanner.close();

	}

}
