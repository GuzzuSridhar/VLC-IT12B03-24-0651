package conditions;

public class IfStatementDemo {
    public static void main(String[] args) {
        int x = 10, y = 20;
        double sal = 4875.44, comm = 564.44;
        String name = "Alex", anotherName = "alex";

        // checking if the salary is more than 5000$
        if (sal > 5000) {
            System.out.println("The salary is above 5000");
            System.out.println("The salary is above 5000");
        }

        // using multiple conditions
        if (comm < 1000) {
            System.out.println("Executable when comm is less than 1000");
        } else if (sal > 1000) {
            System.out.println("Executable when comm is greater than 1000");
        }

        // using conditions with strings
        // never use the == to check string equality
        // instead use the .equals or .equalsIgnoreCase methods for the equality check
        if (name.equals(anotherName))
            System.out.println("names are the same");
        else if (name.equalsIgnoreCase(anotherName))
            System.out.println("names are the same with different case");

    }
}
