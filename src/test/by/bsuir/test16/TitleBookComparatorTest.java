package test.by.bsuir.test16;

import main.by.bsuir.task12.Book;
import main.by.bsuir.task16.TitleBookComparator;

import java.util.Comparator;

public class TitleBookComparatorTest extends BookComparatorTest {
    @Override
    protected Comparator<Book> getComparator() {
        return new TitleBookComparator();
    }

    @Override
    protected boolean isGreater(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle()) > 0;
    }
}
