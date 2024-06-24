package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OurSourceEmployee;

public class Program {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of employeer: ");
        int n = sc.nextInt();

        List<Employee> employeer = new ArrayList<>();

        for(int i = 0; i < n; i ++ ){
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char yAndN = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hours: ");
            Double valuePerHour = sc.nextDouble();

            if (yAndN == 'Y'){
                employeer.add(new Employee(name,hours,valuePerHour));

            } else if (yAndN == 'N') {
                System.out.println("Additional charge: ");
                Double addCharge = sc.nextDouble();

                employeer.add(new OurSourceEmployee(name, hours, valuePerHour, addCharge));
            }
        }

        System.out.println("Payment:");
        for (Employee emp : employeer) {
            System.out.println(emp);
        }

    }
}
