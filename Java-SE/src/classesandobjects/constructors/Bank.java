package classesandobjects.constructors;

// constuctors demo
public class Bank {
    int acctId;
    String acctName;
    float balance;

    // constructor is a special method to create an object
    // the name of the constructor is always the name of the class
    // no object can be created without a constructor
    // a constructor has not return type
    // if no constructor is written, there is a default constructor available
    // implicitly (only when no other constructors are available)
    // a constructor can be overrloaded

    // default constructor
    // no parameters for a default constructor
    public Bank() {
    }

    // fully loaded constructor (overloaded)
    public Bank(int acctId, String acctName, float balance) {
        this.acctId = acctId;
        this.acctName = acctName;
        this.balance = balance;
    }

    public Bank(int acctId, String acctName) {
        this.acctId = acctId;
        this.acctName = acctName;
    }

    public Bank(String acctName, int acctId) {
        this.acctId = acctId;
        this.acctName = acctName;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Bank bank = new Bank(); // calling the default constructor
        bank.acctId = 100;
        bank.acctName = "Alex";
        bank.balance = 1000f;

        Bank bank2 = new Bank(101, "Alice", 9000f); // create an object with fully loaded constructor
        Bank bank3 = new Bank(102, "Alice");
        Bank bank4 = new Bank("Alice", 105);
    }

}
