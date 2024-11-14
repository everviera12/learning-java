package poo_examples.inheritance_person;

public class Person {
    private String name;
    private String last_name;

    public Person(String name, String last_name) {
        this.name = name;
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Last Name: " + last_name;
    }
}
