package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCollection {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    static void getBookList() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static void addBook(Book b) {
        books.add(b);
    }

    public static void main(String[] args) {
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
            addBook(new Book(id, name, auth));
            System.out.print("Do you want to add more books? ([Y]es)/[N]o :");
            temp = scan.nextLine();
            if (temp.equalsIgnoreCase("Y"))
                more = false;
            else if (temp.equalsIgnoreCase("N"))
                more = true;
        }

        getBookList();

        scan.close();

    }

}
