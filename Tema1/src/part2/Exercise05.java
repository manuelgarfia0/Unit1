package part2;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declare variables
		int totalSeconds;
		int seconds;
		int minutes;
		int hours;
		// Ask data to user
		System.out.print("Introduce una cantidad de segundos: ");
		totalSeconds = sc.nextInt();
		// Calculate seconds in hours, minutes and seconds
		hours = totalSeconds / 3600;
		minutes = (totalSeconds % 3600) / 60;
		seconds = totalSeconds % 60;
		// Show data
		System.out.println(hours + " : " + minutes + " : " + seconds);
		// Close scanner
		sc.close();

	}

}
