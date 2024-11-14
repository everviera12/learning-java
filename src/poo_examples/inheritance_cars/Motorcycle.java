package poo_examples.inheritance_cars;

public class Motorcycle extends Vehicle {

    private final Double tank_size;

    public Motorcycle(String brand, String model, double tank_size) {
        super(brand, model);
        this.tank_size = tank_size;
    }

    @Override
    public String toString() {
        return "Motorcycle {" +
                "\n\tBrand: " + super.toString() +
                "\n\tTank Size: " + tank_size + " liters" +
                "\n}";
    }

}

