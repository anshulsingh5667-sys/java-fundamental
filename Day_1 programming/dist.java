package cscorner;
import java.util.Scanner;
public class dist { 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: distance in feet
	        System.out.print("Enter your height in feet: ");
	        double distanceInFeet = scanner.nextDouble();

	        // Convert feet to inches and centimeters
	        double distanceInInches = distanceInFeet * 12;
	        double distanceInCm = distanceInInches * 2.54;

	        // Convert feet to yards and miles
	        double distanceInYards = distanceInFeet / 3;
	        double distanceInMiles = distanceInYards / 1760;

	        // Output
	        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f\n",
	                          distanceInCm, distanceInFeet, distanceInInches);

	        System.out.printf("That equals %.2f yards and %.6f miles\n",
	                          distanceInYards, distanceInMiles);
	    }
	}

