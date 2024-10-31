package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();

        String name;
        System.out.println("Enter student names and IDs (enter blank name to finish):");

        do {
            System.out.print("Enter student name: ");
            name = input.nextLine();
            if (!name.isBlank()) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                input.nextLine();
                students.put(id, name);
            }
        } while (!name.isBlank());

        System.out.println("Student roster:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
