package com.scanner_example;

public class MainScanncer {
    public static void main(String[] args) {

        // objet to class ScannerClass
        ScannerClass scanner_class = new ScannerClass();


        scanner_class.ScannerUserName();
        System.out.println("scanner_class.getUser_name() = " + scanner_class.getUser_name());

        scanner_class.ScannerNumber();
        System.out.println("scanner_class.getNumber() = " + scanner_class.getNumber());
        scanner_class.getScanner().nextLine();

        scanner_class.ScannerCharacter();
        System.out.println("scanner_class.getCharacter() = " + scanner_class.getCharacter());

        scanner_class.getScanner().close();
    }
}
