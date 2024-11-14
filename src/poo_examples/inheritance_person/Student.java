package poo_examples.inheritance_person;

public class Student extends Person {
    private double average;

    public Student(String name, String last_name, double average){
        super(name, last_name);
        this.average = average;
    }

    @Override
    public String toString() {
        return super.toString() + ", Average: " + average;
    }
}
