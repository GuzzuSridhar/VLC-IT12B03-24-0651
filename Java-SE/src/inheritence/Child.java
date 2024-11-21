package inheritence;

public class Child extends Parent {
    String childVar;

    Child() {
        System.out.println("Child constructor called");
    }

    // methods
    void childMethod() {
        System.out.println("Child method called");
    }

    @Override
    void favFood() {
        System.out.println("Child loves chicken");
    }

    @Override
    void occupation() {
        System.out.println("Child is a student");
    }

}
