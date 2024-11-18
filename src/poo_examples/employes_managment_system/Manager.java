package poo_examples.employes_managment_system;

public class Manager extends Employee {

    private double manager_bonus;

    public Manager(String name, double salary, double manager_bonus) {
        super(name, salary);
        this.manager_bonus = manager_bonus;
    }

    @Override
    public double TotalSalary() {
        return getSalary() + manager_bonus;
    }

    @Override
    public void Working() {
        System.out.println(getName() + " is supervising the team.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", manager_bonus=" + manager_bonus +
                '}';
    }
}
