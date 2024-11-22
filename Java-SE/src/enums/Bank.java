package enums;

public class Bank {
    String accno;
    AccountType type;

    @Override
    public String toString() {
        return "Bank [accno=" + accno + ", type=" + type + "]";
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.accno = "abc";
        bank.type = AccountType.SAVINGS;
        System.out.println(bank);
    }
}
