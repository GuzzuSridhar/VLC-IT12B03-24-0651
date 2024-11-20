package classesandobjects;

public class Library {
    public static void main(String[] args) {
        // creating the instances or objects of Book type
        Book b001 = new Book();
        Book b002 = new Book();

        // populate the information of book for each instance

        // populating b001
        b001.title = "Let us C";
        b001.author = "Yeshwant Kanetkar";
        b001.yearOfPublication = 1989;
        b001.genre = "programming";
        b001.numberOfPages = 598;

        // populating b002
        b002.title = "Let us CPP";
        b002.author = "Yeshwant Kanetkar";
        b002.yearOfPublication = 1989;
        b002.genre = "programming";
        b002.numberOfPages = 659;

        // access the information of b001
        System.out.println(b001.title
                + " "
                + b001.author
                + " "
                + b001.yearOfPublication
                + " "
                + b001.numberOfPages
                + " "
                + b001.genre
                + " "
                + Book.libraryName);
        // access the information of b002
        System.out.println(b002.title
                + " "
                + b002.author
                + " "
                + b002.yearOfPublication
                + " "
                + b002.numberOfPages
                + " "
                + b002.genre
                + " "
                + Book.libraryName);

    }
}
