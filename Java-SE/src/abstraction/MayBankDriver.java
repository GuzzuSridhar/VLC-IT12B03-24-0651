package abstraction;

public class MayBankDriver {
    public static void main(String[] args) {
        // Mas m = new Mas() ; not allowed as instance of interface cannot be created
        Mas mayBank = new MayBank(); // allowed as the MayBank is implementing the Mas

        float retAmt = mayBank.fdInterest(1000f, 12);
        System.out.println(retAmt);

        mayBank.archive(100);

    }
}