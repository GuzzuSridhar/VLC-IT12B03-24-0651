package basics;

public class StringType {
    public static void main(String[] args) {
        // strings in java are not primitive type
        // strings are object type
        // used to store textual information
        // strings are charcter arrays. (0 based index)

        String name = "Alex"; // creating a String literal
        System.out.println(name);

        // accessing the String methods
        // access the specific characters of the string
        System.out.println("3rd character in " + name + " is " + name.charAt(3)); // accesses the character at a
                                                                                  // given index
        System.out.println(name.length()); // method to get the length of String
        System.out.println(name.toUpperCase()); // converts to small letters
        System.out.println(name.toLowerCase()); // converts to capital letters

        name = "Big string as possible to test substring";

        System.out.println(name.substring(2)); // returns the string from character 3
        // the end index is ignored
        System.out.println(name.substring(4, 10)); // returns the string from character 3 to character 4

        name = "Alex";
        String anotherName = "alex";
        // check for the string equality
        System.out.println(name.equals(anotherName));
        System.out.println(name.equalsIgnoreCase(anotherName)); // case insensitive check

        // concat
        System.out.println(name.concat(", Is my name"));

        // trim
        name = "  Alex   ";
        System.out.println(name.length());
        System.out.println(name.trim().length());

    }

}
