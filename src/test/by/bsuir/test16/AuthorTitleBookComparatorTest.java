package test.by.bsuir.test16;

import main.by.bsuir.task12.Book;
import main.by.bsuir.task16.AuthorTitleBookComparator;

import java.util.Comparator;

public class AuthorTitleBookComparatorTest extends BookComparatorTest {
    @Override
    protected Comparator<Book> getComparator() {
        return new AuthorTitleBookComparator();
    }

    @Override
    protected boolean isGreater(Book book1, Book book2) {
        if (book1.getAuthor().compareTo(book2.getAuthor()) > 0) {
            return true;
        } else if (book1.getAuthor().compareTo(book2.getAuthor()) == 0) {
            return book1.getTitle().compareTo(book2.getTitle()) > 0;
        }
        return false;
    }
}
