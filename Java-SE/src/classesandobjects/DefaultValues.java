package classesandobjects;

public class DefaultValues {
    // feilds for all primitive types
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValues df = new DefaultValues();
        System.out.println("The default values of the various types in a class are");
        System.out.println("------------------------------------------");
        System.out.println("The default value for byte type is: " + df.b);
        System.out.println("The default value for short type is: " + df.s);
        System.out.println("The default value for int type is: " + df.i);
        System.out.println("The default value for long type is: " + df.l);
        System.out.println("The default value for float type is: " + df.f);
        System.out.println("The default value for double type is: " + df.d);
        System.out.println("The default value for char type is: " + df.c); // '\u0000' is an invisible character
        System.out.println("The default value for boolean type is: " + df.bool);
    }

}
