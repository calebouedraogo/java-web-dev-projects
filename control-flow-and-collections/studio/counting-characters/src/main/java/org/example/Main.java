package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to count characters: ");
        String text = input.nextLine();

        text = text.toLowerCase();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                characterCounts.put(ch, characterCounts.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        input.close();
    }
}