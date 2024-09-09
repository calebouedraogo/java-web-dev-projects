package org.launchcode;
import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles you have driven:");
        double numMiles = input.nextDouble();

        System.out.println("Enter the the amount of gas in gallons you have consumed:");
        double numGasGallons = input.nextDouble();

        double milePerGallon = numMiles / numGasGallons;
        System.out.println("Your fuel consumption is " + milePerGallon + " mile-per-gallons");
    }
}
