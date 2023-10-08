package test.by.bsuir.test16;

import main.by.bsuir.task12.Book;
import main.by.bsuir.task16.PriceBookComparator;

import java.util.Comparator;

public class PriceBookComparatorTest extends BookComparatorTest {
    @Override
    protected Comparator<Book> getComparator() {
        return new PriceBookComparator();
    }

    @Override
    protected boolean isGreater(Book book1, Book book2) {
        return book1.getPrice() > book2.getPrice();
    }

}
