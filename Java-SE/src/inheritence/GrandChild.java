package inheritence;

public class GrandChild extends Child {
    String grandChildVar;

    GrandChild() {
        System.out.println("Grand Child constructor called");
    }

    // methods
    void grandChildMethod() {
        System.out.println("Grand Child Method called");
    }

    @Override
    void favFood() {
        System.out.println("the grand child loves ice cream");
    }

    @Override
    void occupation() {
        System.out.println("Gran Child is a toddler");
    }
}
