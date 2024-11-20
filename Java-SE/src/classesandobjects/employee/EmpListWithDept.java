package classesandobjects.employee;

public class EmpListWithDept {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.ename = "Alex";
        emp.deptno = 10;
        // creating an instance of department for the employee
        emp.d = new Department();
        // populating the new instance of department in employee object
        emp.d.dno = 10;
        emp.d.dname = "Sales";

        System.out.println(emp.ename + " Works in " + emp.d.dname);
    }
}
