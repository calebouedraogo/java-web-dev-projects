package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int num : integerArray) {
            System.out.println(num);
        }

        System.out.println("Odd numbers: ");
        for (int num : integerArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}