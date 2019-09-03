import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;
    Book book1;
    Book book2;

    @Before
    public void setUp(){
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("High Fidelity", "Nick Hornby", "Music");
        book1 = new Book("Fever Pitch", "Nick Hornby", "Sport");
        book2 = new Book("About A Boy", "Nick Hornby", "Humour");
    }

}
