package poo_examples;


public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setOwner("Ever");
        car.setColor("Green");
        car.setCylinders(30000);
        car.setGasoline_tank(69);

        System.out.println(car.toString());

        System.out.println(car.getColor());


        Car car_2 = new Car("Amarrillo", 60, "Ana MAria", 150000);
        System.out.println("car_2: " + car_2.toString());

    }
}
