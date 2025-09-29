package part1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int firstTrimester;
		int secondTrimester;
		int thirdTrimester;
		double reportCard;
		double academicExpedient;
		// Ask data to user
		System.out.println("Insert your grade of the first trimester: ");
		firstTrimester = scanner.nextInt();
		System.out.println("Insert your grade of the second trimester: ");
		secondTrimester = scanner.nextInt();
		System.out.println("Insert your grade of the third trimester: ");
		thirdTrimester = scanner.nextInt();
		// Calculate the mean as we are going to see in the report card
		reportCard = (firstTrimester + secondTrimester + thirdTrimester) / 3;
		// Calculate the mean as we are going to see in the academic expedient
		academicExpedient = (double) (firstTrimester + secondTrimester + thirdTrimester) / 3;
		// Show data
		System.out.println("Mean in the report card: " + reportCard);
		System.out.println("Mean in the academic expedient: " + academicExpedient);
		// Close scanner
		scanner.close();

	}

}
