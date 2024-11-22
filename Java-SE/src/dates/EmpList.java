package dates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpList {

    public static void main(String[] args) {
        // int id = 0;
        // String name = "", dt = "";
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ID: ");
        int id = 0;
        String name = "", dt = "";
        id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the Name: ");
        name = scan.nextLine();
        System.out.print("Enter the Date (yyyy-MM-dd): ");
        dt = scan.nextLine();
        employees.add(new Employee(id, name, LocalDate.parse(dt)));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scan.close();

    }
}
