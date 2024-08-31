package relationships;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}

public class UniDirectionalAssociationExample {
    public static void main(String[] args) {
        Library library = new Library("City Library");
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
