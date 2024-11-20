package classesandobjects;

public class BookCollection {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        // creating instances of Book object for each array element
        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        // populating the book details for the first element
        books[0].title = "Something";
        books[0].author = "Someone";
        books[0].genre = "Something";
        books[0].yearOfPublication = 1987;
        books[0].numberOfPages = 187;
        // populating the book details for the second element
        books[1].title = "evrything";
        books[1].author = "Everyone";
        books[1].genre = "everything";
        books[1].yearOfPublication = 1987;
        books[1].numberOfPages = 187;
        // populating the book details for the third element
        books[2].title = "nothing";
        books[2].author = "nobody";
        books[2].genre = "nothing";
        books[2].yearOfPublication = 1987;
        books[2].numberOfPages = 187;

        // access the book collection in the arrays
        for (Book book : books) {
            System.out.println(book.title + " " + book.author + " " + book.yearOfPublication);
        }
        System.out.println("---------------");
        // access the book collection in the arrays
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title + " " + books[i].author);

        }

    }
}
