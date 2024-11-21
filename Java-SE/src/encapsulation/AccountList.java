package encapsulation;

public class AccountList {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        // we are not allowed to access the private instance variables
        // bankAccount.id;
        // bankAccount.name;
        // bankAccount.balance;

        // instead use the setter methods
        bankAccount.setId(100);
        bankAccount.setName("Alex");
        bankAccount.setBalance(5689f);

        // use the gettwer methods to read the values
        System.out.println(bankAccount.getId());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getBalance());
    }
}
