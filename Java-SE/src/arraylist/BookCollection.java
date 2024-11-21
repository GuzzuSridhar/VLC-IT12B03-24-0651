package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCollection {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int choice;

    static void getBookList() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static void addBook() {
        boolean more = false;
        String name = "", auth = "", temp = "";
        int id = 0;

        while (!more) {
            System.out.print("Enter a Book Id: ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter a Book Name: ");
            name = scan.nextLine();
            System.out.print("Enter a Book Author: ");
            auth = scan.nextLine();
            books.add(new Book(id, name, auth));
            System.out.print("Do you want to add more books? ([Y]es)/[N]o :");
            temp = scan.nextLine();
            if (temp.equalsIgnoreCase("Y"))
                more = false;
            else if (temp.equalsIgnoreCase("N"))
                more = true;
        }
    }

    static void menu() {
        System.out.println("1. Display Books.");
        System.out.println("2. Add Books.");
        System.out.println("3. Search Book.");
        System.out.println("4. update Book detail.");
        System.out.println("5. Exit.");

        System.out.println("Choose from the options below");
        choice = scan.nextInt();
        scan.nextLine();
        showMenu(choice);
    }

    static void showMenu(int ch) {
        switch (choice) {
            case 1:
                getBookList();
                menu();
                break;
            case 2:
                addBook();
                menu();
                break;
            case 3:
                System.out.println("Yet to be implemented");
                menu();
                break;
            case 4:
                System.out.println("Yet to be implemented");
                menu();
                break;
            case 5:
                scan.close();
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        menu();
    }

}
