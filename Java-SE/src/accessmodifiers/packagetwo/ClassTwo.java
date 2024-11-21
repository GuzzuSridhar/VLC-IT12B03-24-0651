package accessmodifiers.packagetwo;

public class ClassTwo {

    // instance variables with different access modifiers
    public int publicVar; // public access modifier
    private int privateVar; // private access modifier
    int defaultVar; // default access modifier
    protected int protectedVar; // protected access modifier

    // instance methods with different access modifiers

    // public method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // private method
    private void privateMethod() {
        System.out.println("private Method");
    }

    // default method
    void defaultMethod() {
        System.out.println("default Method");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("protected Method");
    }

    // access the variables and methods in same class
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        // access all of the variables
        System.out.println(classTwo.publicVar);
        System.out.println(classTwo.privateVar);
        System.out.println(classTwo.defaultVar);
        System.out.println(classTwo.protectedVar);

        // access all of the methods
        classTwo.publicMethod();
        classTwo.privateMethod();
        classTwo.defaultMethod();
        classTwo.protectedMethod();

    }

}

/*
 * 4 access modifiers
 * ---------------------
 * public
 * private
 * default
 * protected
 * 
 * are applied to variables, methods, class, interface, enums
 */