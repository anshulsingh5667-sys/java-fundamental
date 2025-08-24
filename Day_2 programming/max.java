package cscorner;
import java.util.Scanner;
public class max {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: number of students
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = scanner.nextInt();

	        // Calculate maximum number of handshakes using combination formula
	        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

	        // Output the result
	        System.out.printf("The maximum number of handshakes among %d students is %d\n",
	                          numberOfStudents, maxHandshakes);
	    }
	}

