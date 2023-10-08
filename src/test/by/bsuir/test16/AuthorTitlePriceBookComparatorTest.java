package test.by.bsuir.test16;

import main.by.bsuir.task12.Book;
import main.by.bsuir.task16.AuthorTitlePriceBookComparator;

import java.util.Comparator;

public class AuthorTitlePriceBookComparatorTest extends BookComparatorTest {
    @Override
    protected Comparator<Book> getComparator() {
        return new AuthorTitlePriceBookComparator();
    }

    @Override
    protected boolean isGreater(Book book1, Book book2) {
        if (book1.getAuthor().compareTo(book2.getAuthor()) > 0) {
            return true;
        } else if (book1.getAuthor().compareTo(book2.getAuthor()) == 0) {
            if (book1.getTitle().compareTo(book2.getTitle()) > 0) {
                return true;
            } else if (book1.getTitle().compareTo(book2.getTitle()) == 0) {
                return book1.getPrice() > book2.getPrice();
            }
        }
        return false;
    }
}
