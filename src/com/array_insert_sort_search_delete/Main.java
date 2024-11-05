package com.array_insert_sort_search_delete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ever", "Sam", "Pedro", "Miguel", "Gaby"};

        // Sorted array
        Arrays.sort(names);

        // Iterate the array
        for (String name : names) {
            System.out.println("name = " + name);
        }

        // Search in array
        boolean found = false;
        int pos = 0;
        Scanner search = new Scanner(System.in);
        System.out.println("Type something to search:");
        String target = search.next();

        for (pos = 0; pos < names.length; pos++) {
            if (names[pos].equalsIgnoreCase(target)) {
                // Value found, print and exit the loop
                System.out.println("Value " + target + " found at position " + pos);
                found = true;
                break;  // Exit the loop once the value is found
            }
        }

        // If value was found, proceed to remove it
        if (found) {
            String[] newNames = new String[names.length - 1];

            // Copy elements before the found position
            System.arraycopy(names, 0, newNames, 0, pos);
            // Copy elements after the found position
            System.arraycopy(names, pos + 1, newNames, pos, names.length - pos - 1);

            names = newNames; // Replace the original array with the new one

            // Print the new array
            System.out.println("Array after removing the name:");
            for (String name : names) {
                System.out.println("name = " + name);
            }
        } else {
            // If value was not found, print a message
            System.out.println("Value " + target + " not found in the array");
        }

        search.close(); // Close the scanner
    }
}
