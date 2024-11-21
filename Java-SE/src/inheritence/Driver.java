package inheritence;

public class Driver {
    public static void main(String[] args) {
        Child child = new Child(); // creates an object of parent class before child class

        // check the access privileges on child instance
        child.childVar = "Child";
        child.childMethod();

        // call parent feild and methods on child instance
        child.parentVar = "Parent";
        child.parentMethod();
        child.favFood();
        child.occupation();

        Parent parent = new Parent();
        parent.parentVar = "Parent";
        parent.favFood();
        parent.occupation();

    }
}
