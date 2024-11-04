package com.scanner_example;

import java.util.Scanner;

public class ScannerClass {

    private int number;
    private String user_name;
    private Character character;


    private final Scanner scanner;

    public ScannerClass() {
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void ScannerNumber() {
        System.out.println("Type a number");
        this.number = scanner.nextInt();
    }


    public void ScannerUserName() {
        System.out.println("Type a user name");
        this.user_name = scanner.nextLine();
    }

    public void ScannerCharacter() {
        System.out.println("Type a character");
        this.character = scanner.next().charAt(0);

    }

    public int getNumber() {
        return number;
    }

    public String getUser_name() {
        return user_name;
    }

    public Character getCharacter() {
        return character;
    }
}
