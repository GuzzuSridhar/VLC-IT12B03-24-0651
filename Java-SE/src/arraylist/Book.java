package arraylist;

public class Book {
    int bookid;
    String title;
    String author;

    public Book(int bookid, String title, String author) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return bookid + " - " + title + " - " + author;
    }

}