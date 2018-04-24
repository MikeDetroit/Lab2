
// Michael DeCoopman, Java Lab 2

import java.util.Scanner;

public class AreaPerimeterClassroom {
	public static void main(String[] args) {
		// declare variables
		double area;
		double perimeter;
		double length;
		double width;

		Scanner scnr = new Scanner(System.in);
		String choice = "y";

		do {

			// Print and user input
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println(" ");
			System.out.println("Enter Length:");
			length = scnr.nextDouble();

			System.out.println("Enter Width:");
			width = scnr.nextDouble();
scnr.nextLine();
			// Calculations for area and perimeter
			area = length * width;
			perimeter = 2 * (length + width);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);

			System.out.println(" ");
			System.out.println("Continue? (y/n):");
			choice = scnr.nextLine();

			// do while loop, put scanner outside of loop
		} while (choice.equals("y"));

	}
}
