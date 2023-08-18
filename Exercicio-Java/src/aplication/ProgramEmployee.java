package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("NAME: ");
        emp.name = input.nextLine();

        System.out.println("GROSS SALARY: ");
        emp.grossSalary = input.nextDouble();

        System.out.println("TAX: ");
        emp.tax = input.nextDouble();

        System.out.println("\nEMPLOYEE: " + emp);

        System.out.println("\nWhich percentage to increase salary? ");
        double percentage = input.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Updated data: " + emp);

        input.close();
    }
}
