package poo_examples.inheritance_cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del coche:");
        System.out.print("Marca: ");
        String carBrand = scanner.nextLine();
        System.out.print("Modelo: ");
        String carModel = scanner.nextLine();
        System.out.print("Tamaño del tanque (en litros): ");
        double carTankSize = scanner.nextDouble();
        scanner.nextLine();

        Car car = new Car(carBrand, carModel, carTankSize);
        System.out.println("Datos del coche ingresados: " + car);

        System.out.println("\nIngrese los datos de la motocicleta:");
        System.out.print("Marca: ");
        String motoBrand = scanner.nextLine();
        System.out.print("Modelo: ");
        String motoModel = scanner.nextLine();
        System.out.print("Tamaño del tanque (en litros): ");
        double motoTankSize = scanner.nextDouble();

        Motorcycle motorcycle = new Motorcycle(motoBrand, motoModel, motoTankSize);
        System.out.println("Datos de la motocicleta ingresados: " + motorcycle);

        scanner.close();
    }
}
