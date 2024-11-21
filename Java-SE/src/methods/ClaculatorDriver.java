package methods;

public class ClaculatorDriver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.subtract(10, 20));
        System.out.println(calculator.multiply(10, 20));
        System.out.println(calculator.divide(10, 20));

        // calling a static method (without instance)
        System.out.println(Calculator.getPi());
    }
}
