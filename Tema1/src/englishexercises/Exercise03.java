package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int lenght;
		int height;
		double area;
		double perimeter;
		// Ask data to user
		System.out.println("Introduce the length of the rectangle: ");
		lenght = scanner.nextInt();
		System.out.println("Introduce the height of the rectangle: ");
		height = scanner.nextInt();
		// Calculate the area and perimeter
		area = lenght * height;
		perimeter = 2 * (lenght + height);
		// Show data
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		// Close scanner
		scanner.close();

	}

}
