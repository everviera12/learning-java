package poo_examples.inheritance_cars;

import java.util.Scanner;

public class Car extends Vehicle{
    private double tank_size;

    Scanner scanner = new Scanner(System.in);

    public Car(String brand, String model, double tank_size) {
        super(brand, model);
        this.tank_size = tank_size;
    }

    @Override
    public String toString() {
        return "Car {" +
                "\n\tBrand and Model: " + super.toString() +
                "\n\tTank Size: " + tank_size + " liters" +
                "\n}";    }
}

