package week6;

import java.util.ArrayList;

public class ex101 {
    public static void main(String[] args) {
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library.searchByTitle("1851");
        for (Book book: result) {
            System.out.println(book);
        }

        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        for (Book book:  Library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
