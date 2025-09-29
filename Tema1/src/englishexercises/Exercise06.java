package englishexercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scanner = new Scanner(System.in);
		// Declare variables
		int numStudents;
		int sizeTeams;
		int leftStudents;
		int teams;
		// Ask data to user
		System.out.println("How many students are in the class?");
		numStudents = scanner.nextInt();
		System.out.println("What`s the size of the teams?");
		sizeTeams = scanner.nextInt();
		// Calculate teams
		teams = numStudents / sizeTeams;
		// Calculate left students
		leftStudents = numStudents - teams * sizeTeams;
		// Show data
		System.out.println("There are " + teams + " teams of " + sizeTeams + " students each group.");
		System.out.println("There are " + leftStudents + " students without team.");
	}

}
