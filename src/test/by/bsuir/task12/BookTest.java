package test.by.bsuir.task12;

import main.by.bsuir.task12.Book;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private static final Random RANDOM = new Random();

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Book originalBook = new Book("Title", "Author", 100, 12345);

        Book clonedBook = (Book) originalBook.clone();

        assertNotSame(originalBook, clonedBook);

        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
        assertEquals(originalBook.getIsbn(), clonedBook.getIsbn());
    }

    @Test
    public void compareToTest() {
        Book book1 = new Book("Title1", "Author1", 100, 12345);
        Book book2 = new Book("Title2", "Author2", 150, 54321);
        Book book3 = new Book("Title3", "Author3", 200, 11111);

        assertTrue(book1.compareTo(book2) < 0);
        assertTrue(book1.compareTo(book3) > 0);
        assertTrue(book2.compareTo(book3) > 0);
    }

    @Test
    public void compareToTestSorting() {
        Book[] books = new Book[100];
        for (int i = 0; i < 100; i++) {
            books[i] = new Book("Title" + i, "Author" + i, 100 + i, RANDOM.nextInt());
        }

        Arrays.sort(books);
        assertTrue(isSorted(books));
    }

    private boolean isSorted(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getIsbn() > books[i + 1].getIsbn()) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void equalsTest() {
        Book book1 = new Book("Title1", "Author1", 100, 12345);
        Book book2 = new Book("Title2", "Author2", 150, 54321);
        Book book3 = new Book("Title3", "Author3", 200, 11111);
        Book book4 = new Book("Title1", "Author1", 100, 12345);

        assertNotEquals(book1, book2);
        assertNotEquals(book1, book3);
        assertNotEquals(book2, book3);
        assertEquals(book1, book4);
    }

    @Test
    public void hashCodeTest() {
        Book book1 = new Book("Title1", "Author1", 100, 12345);
        Book book2 = new Book("Title2", "Author2", 150, 54321);
        Book book3 = new Book("Title3", "Author3", 200, 11111);
        Book book4 = new Book("Title1", "Author1", 100, 12345);

        assertNotEquals(book1.hashCode(), book2.hashCode());
        assertNotEquals(book1.hashCode(), book3.hashCode());
        assertNotEquals(book2.hashCode(), book3.hashCode());
        assertEquals(book1.hashCode(), book4.hashCode());
    }
}