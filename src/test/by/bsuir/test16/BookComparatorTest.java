package test.by.bsuir.test16;

import main.by.bsuir.task12.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class BookComparatorTest {
    private static final Random RANDOM = new Random();
    private static Book[] books;

    @BeforeAll
    public static void initBooks() {
        books = new Book[100];
        for (int i = 0; i < books.length; i++) {
            books[i] = createBook();
        }
    }

    private static Book createBook() {
        return new Book("Title" + RANDOM.nextInt(100),
                "Author" + RANDOM.nextInt(100),
                100 + RANDOM.nextInt(100),
                RANDOM.nextInt());
    }

    @Test
    public void compareTestSorting() {
        Comparator<Book> comparator = getComparator();
        Arrays.sort(books, comparator);
        assertTrue(isSorted(books));
    }

    protected abstract Comparator<Book> getComparator();

    protected abstract boolean isGreater(Book book1, Book book2);

    private boolean isSorted(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (isGreater(books[i], books[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
