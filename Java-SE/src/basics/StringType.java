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

    }

}
