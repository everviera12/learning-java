package poo_examples.inheritance_animals;

public class Cat extends Animal{

    public Cat(String namme, String gender) {
        super(namme, gender);
    }

    public void MakeNoise(String sound) {
        System.out.println(getNamme() + " (the cat) makes: " + sound);
    }
}

