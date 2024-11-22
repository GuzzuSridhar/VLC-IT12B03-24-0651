package stringbuilder;

public class ImmutableDemo {
    // Strings are immutable, the value cannot be changed
    // StringBuilder is mutable and hence the value can be changed
    public static void main(String[] args) {
        String test = "Hello";
        System.out.println(test.hashCode());
        test += " World";
        System.out.println(test.hashCode());

        // ways of declaring a String
        // string literal uses the String pool
        String s = "test";
        String p = "test";

        System.out.println(s == p); // infers to be true as the s and p point to the memory in the string pool

        System.out.println("---------------");
        System.out.println(s.hashCode());
        System.out.println(p.hashCode());
        System.out.println("---------------");

        // String Object
        // uses the heap memory and creates an object
        String o = new String("Hello");
        String q = new String("Hello");

        System.out.println(o == q); // not the correct way as both o and p are two different objects
        System.out.println(o.equals(q));

        System.out.println(o.hashCode());
        System.out.println(q.hashCode());
        System.out.println("---------------");

        StringBuilder t = new StringBuilder("Hello");
        System.out.println(t.hashCode());
        t.append(" World");
        System.out.println(t.hashCode());

    }

}
