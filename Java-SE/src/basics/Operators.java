package basics;

public class Operators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int x = 10, y = 20, z; // local variables (method variables) have to be initialized before using them
        // System.out.println(z); // not allowed as z is not initialized

        // operators in Java
        System.out.println("----------------Arithmetic Operators----------");
        // add, subtract, multiply, divide, modulus, post increment/decrement, pre
        // increment/decrement
        System.out.println(x + y); // add
        System.out.println(x - y); // subtract
        System.out.println(x * y); // multiply
        System.out.println(x / y); // divide
        System.out.println(x % y); // modulo
        System.out.println(x++); // post increment (apply current value and then increment )
        System.out.println(++x); // pre increment (increment and then apply the value)
        System.out.println(x--); // post decrement (apply current value and then decrement )
        System.out.println(--x); // pre decrement (decrement and then apply the value)

        // add (+) is an overloaded operator that can work with numbers and strings
        String firstName = "Bill";
        String lastName = "Gates";
        System.out.println(firstName + lastName);

        System.out.println("----------------Assignment Operators----------");
        // equals, add equals, subtract equals, multiply equals, divide equals, modulo
        // equals
        int i = 10; // equals
        char c = 'a'; // equals
        System.out.println(i); // 10

        i += 10; // same as writing i = i + 10;
        System.out.println(i); // 20

        i -= 10; // same as writing i = i - 10;
        System.out.println(i); // 10

        i *= 10; // same as writing i = i * 10;
        System.out.println(i); // 100

        i /= 10; // same as writing i = i / 10;
        System.out.println(i); // 10

        i %= 10; // same as writing i = i % 10;
        System.out.println(i); // 0

        System.out.println("----------------Comparision Operators----------");
        // always boolean output
        // equality, non equality, greater than. lesser than, greater than equals,
        // lesser than equals,
        x = 10;
        y = 20;
        System.out.println(x == y); // equality check
        System.out.println(x != y); // non equality check
        System.out.println(x > y); // greater than check
        System.out.println(x < y); // lesser than check
        System.out.println(x >= y); // greater than equals check
        System.out.println(x <= y); // lesser than equals check

        System.out.println("----------------Logical Operators----------");
        // logical AND, logical OR, NOT
        float salary = 6567.89f;
        float comm = 567.44f;
        // condition to check if the salary is more than 5000$ also if the sum of salary
        // and comm is more 10000
        boolean res = salary > 5000 && (salary + comm) > 10000; // using logical AND
        System.out.println(res);
        res = salary > 5000 || (salary + comm) > 10000; // using logical OR
        System.out.println(res);

        // using the NOT
        System.out.println(!res); // not (!)
    }
}
