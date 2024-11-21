package accessmodifiers.packagetwo;

// checking the access modifiers in different class in same package
public class ClassThree {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        // access all of the variables
        System.out.println(classTwo.publicVar);
        // System.out.println(classTwo.privateVar); // not allowed outside the class
        System.out.println(classTwo.defaultVar);
        System.out.println(classTwo.protectedVar);

        // access all of the methods
        classTwo.publicMethod();
        // classTwo.privateMethod(); // not allowed outside the class
        classTwo.defaultMethod();
        classTwo.protectedMethod();

    }
}
