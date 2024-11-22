package TestConcepts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import dates.Employee;

public class TestDeclare {
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean more = true;
        while (more) {
            System.out.print("Enter the ID: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the Name: ");
            String name = scan.nextLine();
            System.out.print("Enter the Date (yyyy-MM-dd): ");
            String dt = scan.nextLine();
            employees.add(new Employee(id, name, LocalDate.parse(dt)));
            System.out.println("Enter more (0/1)");
            int tmp = scan.nextInt();
            if (tmp == 1)
                more = true;
            else
                more = false;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        scan.close();

    }
}
