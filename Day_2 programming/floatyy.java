package cscorner;
import java.util.Scanner;
public class floatyy {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: two floating-point numbers
	        System.out.print("Enter the first number: ");
	        double number1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number2 = scanner.nextDouble();

	        // Perform arithmetic operations
	        double addition = number1 + number2;
	        double subtraction = number1 - number2;
	        double multiplication = number1 * number2;
	        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Handle division by zero

	        // Output the results
	        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
	                          number1, number2, addition, subtraction, multiplication, division);
	    }
	}


