package cscorner;

public class uni {
	    public static void main(String[] args) {
	        double fee = 125000;                // Original course fee
	        double discountPercent = 10;        // Discount percentage

	        double discount = (fee * discountPercent) / 100;  // Calculate discount amount
	        double finalFee = fee - discount;                 // Calculate final fee after discount

	        System.out.println("The discounted amount is INR " + discount);
	        System.out.println("The fee you have to pay is INR " + finalFee);
	    }
	}

