package com.casting_variables;

public class Main {
    public static void main(String[] args) {

        String number_string = "50";
        String number_string_2 = "10";

        int number = Integer.parseInt(number_string);
        int number2 = Integer.parseInt(number_string_2);

        System.out.println("The amount is = " + (number + number2));
        
        Integer number_integer = 100;
        System.out.println("number_integer.toString() = " + number_integer.toString());
    }
}
