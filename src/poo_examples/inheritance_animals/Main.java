package poo_examples.inheritance_animals;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Firulais", "Male");
        Cat cat = new Cat("Michi", "Female");

        System.out.println("cat = " + cat);
        cat.MakeNoise("Miau miau!");


        System.out.println("dog = " + dog);
        dog.MakeNoise("Wof wof!");
    }
}
