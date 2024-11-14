package poo_examples.inheritance_cars;

public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "\n\tBrand: '" + brand + '\'' +
                "\n\tModel: '" + model + '\'' +
                "\n}";
    }

}