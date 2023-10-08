package test.by.bsuir.test16;

import main.by.bsuir.task12.Book;
import main.by.bsuir.task16.AuthorBookComparator;

import java.util.Comparator;

public class AuthorBookComparatorTest extends BookComparatorTest {
    @Override
    protected Comparator<Book> getComparator() {
        return new AuthorBookComparator();
    }

    @Override
    protected boolean isGreater(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor()) > 0;
    }
}
