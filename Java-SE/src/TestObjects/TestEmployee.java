package TestObjects;

import packages.Employee;

public class TestEmployee {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Employee emp = new Employee();
        // Department dept =new Dapartment(); // cannot access from "packages" as it is
        // not public
    }
}
