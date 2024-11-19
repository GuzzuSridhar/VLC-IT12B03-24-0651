package basics;

public class Operators {
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

        System.out.println("----------------Assignment Operators----------");
        System.out.println("----------------Comparision Operators----------");
        System.out.println("----------------Logical Operators----------");
    }
}
