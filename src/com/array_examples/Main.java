package com.array_examples;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        // for with numbers
        System.out.println("array = " + array.length);
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.print("array [i] = " + array[i]);
        }

        // for with strings
        String[] names = {"Ever", "Victor", "Pedro", "Phuc"};
        System.out.println("\nnames = " + names[2]);
        for (int i = 0; i < names.length; i++) {
            System.out.print("names[" + i + "] = " + names[i]);
        }

        // if else
        Integer number = 100;
        if (number instanceof Number) {
            System.out.println("It's a Number");
        } else {
            System.out.println("It's not a Number");
        }

        // same case with different sentence
        String message = +number + " it's a Number";
        System.out.println("message = " + message);
    }
}
