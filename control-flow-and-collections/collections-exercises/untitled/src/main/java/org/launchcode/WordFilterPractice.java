package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFilterPractice {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "banana", "peach", "berry", "plum", "cherry"));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word length to search for: ");
        int length = input.nextInt();

        printWordsWithLength(words, length);
    }

    public static void printWordsWithLength(List<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}