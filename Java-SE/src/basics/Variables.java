package basics;

public class Variables {
    public static void main(String[] args) {
        // Declareing Variables
        // Syntax
        // <type> <name> = <default value>;

        // example of a number type variable named "age"
        int age = 10;
        // printing the value of the age variable to console
        System.out.println(age);

        // variable to store text info
        String name = "AnyOne";
        System.out.println(name);

    }
}

// naming rules for variables
/*
 * pascal case
 * must start with
 * a letter (alphabet)
 * _ (underscore)
 * dollar sign ($)
 * 
 * It can inclued
 * alphabets
 * numbers
 * _ (underscore)
 * 
 * Are case sensitive
 * age is not same as Age
 * 
 * Reveserved words not allowed
 * like
 * class
 * int
 * main
 * List of all reserved words
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 */