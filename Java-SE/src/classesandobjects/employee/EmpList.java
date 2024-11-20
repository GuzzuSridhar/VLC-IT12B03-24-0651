package classesandobjects.employee;

import java.util.Scanner;

public class EmpList {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        Scanner scan = new Scanner(System.in);

        // create instances of Employees for each array element and populate
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.print("Enter Employee Name: ");
            employees[i].ename = scan.nextLine();
            System.out.print("Enter Employee Department: ");
            employees[i].deptno = scan.nextInt();
            scan.nextLine();
        }

        // print all the employees
        for (Employee emp : employees) {
            System.out.println(emp.ename + " " + emp.deptno);
        }
        scan.close();
    }
}
