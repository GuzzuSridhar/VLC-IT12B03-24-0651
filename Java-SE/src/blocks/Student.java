package blocks;

public class Student {
    int sid;
    String name;
    static int counter;

    // instance block
    {
        // System.out.println("Inctance block called");
        counter++;
        System.out.println(counter + " Students created");
    }

    // static block
    static {
        System.out.println("Static Block called");
        // initiate the connection to the db / files or any other resources
    }
}
