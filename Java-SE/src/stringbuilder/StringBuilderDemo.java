package stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        StringBuilder location = new StringBuilder("Singapore");
        StringBuilder greet = new StringBuilder("Hello");

        // append method
        name.append("Alex");

        System.out.println(name);
        System.out.println(location);

        // StringBuilder Methods
        greet.append(" World!");
        System.out.println(greet);

        // insert method
        greet.insert(6, "good ");
        System.out.println(greet);

        // replace method
        greet.replace(6, 10, "amazing");
        System.out.println(greet);

        // delete method
        greet.delete(6, 14);
        System.out.println(greet);

        // length method
        System.out.println(greet.length());

        // charAt method
        System.out.println(greet.charAt(0));

        // substring method
        System.out.println(greet.substring(0, 5));

        // reverse method
        System.out.println(greet.reverse());
    }
}
