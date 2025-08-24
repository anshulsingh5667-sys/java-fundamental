package cscorner;
import java.util.Scanner;
public class perim {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: perimeter of the square
	        System.out.print("Enter the perimeter of the square: ");
	        double perimeter = scanner.nextDouble();

	        // Calculate the side length
	        double side = perimeter / 4;

	        // Output the result
	        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
	    }
	}
