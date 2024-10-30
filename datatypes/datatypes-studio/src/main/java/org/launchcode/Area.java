package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radius = null;

        while (true) {
            System.out.print("Enter a radius: ");
            try {
                radius = Double.parseDouble(scanner.nextLine());
                if (radius < 0) {
                    System.out.println("Radius cannot be negative. Please enter a positive value.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle " + radius + " is: " + area);
    }
}
