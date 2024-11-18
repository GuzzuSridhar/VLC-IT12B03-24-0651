package basics;

public class Datatypes {
    // main method is the entry pint into a class / application
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // primitive data types

        // numeric types
        byte age = 50;
        short count = 1000;
        int i = 2500;
        long l = 8788;

        // max of 8 digits incl of the decimal places
        float salary = 1000.25F;
        // max of 15-16 digits incl of the decimals
        double comm = 123.44;

        // character type
        char c = 'a'; // assigning a character literal
        char x = 97; // assigning a ascii value to char type
        char u = '\u0024';

        // boolean
        boolean isValid = true;
        boolean isGood = false;

        // print the variable values
        System.out.println(age);
        System.out.println(count);
        System.out.println(i);
        System.out.println(l);
        System.out.println(salary);
        System.out.println(comm);

        System.out.println(c);
        System.out.println(x);
        System.out.println(u);

    }
}
