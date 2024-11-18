package poo_examples.employes_managment_system;

public class Developer extends Employee {
    private String programming_language;

    public Developer(String name, double salary, String programming_language) {
        super(name, salary);
        this.programming_language = programming_language;
    }

    @Override
    public void Working() {
        System.out.println(getName() + " is programming in " + programming_language + ".");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", programming_language='" + programming_language + '\'' +
                '}';
    }
}
