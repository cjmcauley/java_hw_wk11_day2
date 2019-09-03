import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(2);
        book = new Book("High Fidelity", "Nick Hornby", "Music");
        book1 = new Book("Fever Pitch", "Nick Hornby", "Sport");
        book2 = new Book("About A Boy", "Nick Hornby", "Humour");
        borrower = new Borrower();
    }

    @Test
    public void countTheBooksInTheLibrary(){
        assertEquals(0, this.library.getBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, this.library.getBooks());
    }

    @Test
    public void removeBookFromLibrary(){
        library.addBook(book);
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(1, this.library.getBooks());

    }

    @Test
    public void AddToBorrower(){
        library.addBook(book);
        library.addBook(book1);
        library.lendBook(borrower);
        assertEquals(1, this.borrower.getBooks());
    }
}
