package poo_examples.inheritance_animals;

public class Animal {
    private String namme;
    private String gender;
    private String sound;

    public Animal(String namme, String gender) {
        this.namme = namme;
        this.gender = gender;
    }

    public String getNamme() {
        return namme;
    }

    public void MakeNoise(String sound) {
        System.out.println(namme + " makes a noise: " + sound);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "namme='" + namme + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
