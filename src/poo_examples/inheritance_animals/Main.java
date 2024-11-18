package poo_examples.inheritance_animals;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Firulais", "Male");
        Cat cat = new Cat("Michi", "Female");

        // polimorfism
        Animal dog_animal = new Dog("Firulais", "Male");
        Animal cat_animal = new Cat("Michi", "Female");

        System.out.println("cat = " + cat);
        dog_animal.MakeNoise("Miau miau!");


        System.out.println("dog = " + dog);
        cat_animal.MakeNoise("Wof wof!");
    }
}
