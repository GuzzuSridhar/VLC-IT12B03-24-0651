package accessmodifiers.packageone;

import accessmodifiers.packagetwo.ClassTwo;

// access modifiers out side the package in a subclass
public class SubClass extends ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        SubClass subClass = new SubClass();

        // access all of the variables
        System.out.println(classTwo.publicVar);
        // System.out.println(classTwo.privateVar);
        // System.out.println(classTwo.defaultVar);
        // System.out.println(classTwo.protectedVar);

        // access all of the methods
        classTwo.publicMethod();
        // classTwo.privateMethod();
        // classTwo.defaultMethod();
        // classTwo.protectedMethod();

        // using the SubClass Instance

        // access all of the variables
        System.out.println(subClass.publicVar);
        // System.out.println(classTwo.privateVar);
        // System.out.println(subClass.defaultVar);
        System.out.println(subClass.protectedVar);

        // access all of the methods
        subClass.publicMethod();
        // classTwo.privateMethod();
        // subClass.defaultMethod();
        subClass.protectedMethod();

    }
}
