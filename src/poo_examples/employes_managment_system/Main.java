package poo_examples.employes_managment_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type employee number: ");
        int employ_number = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[employ_number];

        for (int i = 0; i < employ_number; i++) {
            System.out.println("\nComplete the form for employee #" + (i + 1));

            System.out.println("Is Manager or Developer? (m/d)");
            String employ_type = scanner.nextLine();

            System.out.println("Type the employee's name:");
            String employ_name = scanner.nextLine();

            System.out.println("What is the salary?");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            if (employ_type.equalsIgnoreCase("m")) {
                System.out.println("Type the Manager bonus:");
                double bonus = scanner.nextDouble();
                scanner.nextLine();
                employees[i] = new Manager(employ_name, salary, bonus);
            } else if (employ_type.equalsIgnoreCase("d")) {
                System.out.println("Type the Programming Language:");
                String language = scanner.nextLine();
                employees[i] = new Developer(employ_name, salary, language);
            } else {
                System.out.println("Invalid employee type. Defaulting to Developer.");
                employees[i] = new Developer(employ_name, salary, "Unknown");
            }
        }

        for (Employee emp : employees) {
            System.out.println("\n" + emp);
            emp.Working();
            System.out.println("Total Salary: $" + emp.TotalSalary());
        }

        scanner.close();
    }
}
