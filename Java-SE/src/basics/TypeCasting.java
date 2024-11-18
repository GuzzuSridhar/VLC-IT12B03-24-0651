package basics;

public class TypeCasting {
    public static void main(String[] args) {
        // two types of type cast (implicit and explicit)

        // implicit cast (widening cast)
        // supported types
        // byte -> short -> int -> long -> float -> double
        // char -> int -> int -> float -> double

        // explicit type cast (Narrowing cast) (data loss chance)
        // supported types
        // double -> float -> long --> int -> short -> byte

        // example of a widening cast
        int num = 25;
        double d = num;
        System.out.println(d);

        // example of a narrowing cast
        double dub = 42.45;
        int i = dub;
        System.out.println(i);

    }
}
