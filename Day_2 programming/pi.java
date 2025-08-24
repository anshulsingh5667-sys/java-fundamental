package cscorner;

public class pi {
	    // Constant for Earth's radius in kilometers
	    static final double EARTH_RADIUS_KM = 6378.0;

	    // Conversion factor: 1 kilometer = 0.621371 miles
	    static final double KM_TO_MILES = 0.621371;

	    public static void main(String[] args) {
	        // Calculate Earth's volume in cubic kilometers
	        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(EARTH_RADIUS_KM, 3);

	        // Convert volume to cubic miles
	        double radiusMiles = EARTH_RADIUS_KM * KM_TO_MILES;
	        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

	        // Display the results
	        System.out.printf("🌍 The volume of Earth in cubic kilometers is %.2f km³%n", volumeKm3);
	        System.out.printf("🌎 The volume of Earth in cubic miles is %.2f mi³%n", volumeMiles3);

	        // Example: Convert a distance from kilometers to miles
	        double distanceKm = 100.0; // You can change this value
	        double distanceMiles = convertKmToMiles(distanceKm);
	        System.out.printf("🚗 %.2f kilometers is equal to %.2f miles%n", distanceKm, distanceMiles);
	    }

	    // Method to convert kilometers to miles
	    public static double convertKmToMiles(double km) {
	        return km * KM_TO_MILES;
	    }
	}


