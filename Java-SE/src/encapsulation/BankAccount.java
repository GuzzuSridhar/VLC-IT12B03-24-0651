package encapsulation;

import java.util.Scanner;

public class BankAccount {
    private int id;
    private String name;
    private float balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter password");
        String pass = scan.nextLine();
        if (pass.equals("password"))
            this.balance = balance;
        else
            System.out.println("Not authorized");
        scan.close();
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", balance=" + balance;
    }

}
