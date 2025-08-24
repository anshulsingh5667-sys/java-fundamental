package cscorner;
import java.util.Scanner;

public class feet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.printf("Your height in cm is %.2f, while in feet is %d and inches is %.2f\n",
                          heightCm, feet, inches);
    }
}