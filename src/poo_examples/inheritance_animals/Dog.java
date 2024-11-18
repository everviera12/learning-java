package poo_examples.inheritance_animals;

public class Dog extends Animal{

    public Dog(String namme, String gender) {
        super(namme, gender);
    }

    public void MakeNoise(String sound) {
        System.out.println(getNamme() + " (the dog) makes: " + sound);
    }

}
