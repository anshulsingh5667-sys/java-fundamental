package cscorner;
import java.util.Scanner;

public class height {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: base and height in inches
	        System.out.print("Enter the base of the triangle (in inches): ");
	        double base = scanner.nextDouble();

	        System.out.print("Enter the height of the triangle (in inches): ");
	        double heightInInches = scanner.nextDouble();

	        // Calculate area in square inches
	        double areaInInches = 0.5 * base * heightInInches;

	        // Convert area to square centimeters (1 inch = 2.54 cm, so 1 in² = 6.4516 cm²)
	        double areaInCm = areaInInches * 6.4516;

	        // Convert height to cm, feet, and inches
	        double heightInCm = heightInInches * 2.54;
	        double heightInFeet = heightInInches / 12;

	        // Output
	        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f\n",
	                          heightInCm, heightInFeet, heightInInches);

	        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters\n",
	                          areaInInches, areaInCm);
	    }
	}


