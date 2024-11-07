package poo_examples;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Car {
    private String color;
    private Integer gasoline_tank;
    private Integer cylinders;
    private String owner;

    // CONSTRUCTOR
    public Car() {
        this.color = color;
        this.gasoline_tank = gasoline_tank;
        this.cylinders = cylinders;
        this.owner = owner;
    }

    public Car(String color, Integer gasoline_tank, String owner, Integer cylinders) {
        this.color = color;
        this.gasoline_tank = gasoline_tank;
        this.owner = owner;
        this.cylinders = cylinders;
    }

    // GET
    public String getColor() {
        System.out.println("color red from getColor");
        return color;
    }

    public Integer getGasoline_tank() {
        return gasoline_tank;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public String getOwner() {
        return owner;
    }


    // SET
    public void setColor(String color) {
        this.color = color;
    }

    public void setGasoline_tank(Integer gasoline_tank) {
        this.gasoline_tank = gasoline_tank;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{\n" +
                "color='" + color + '\'' +
                ", \ngasoline_tank=" + gasoline_tank +
                ", \ncylinders=" + cylinders +
                ", \nowner='" + owner + '\'' +
                '}';
    }
}
