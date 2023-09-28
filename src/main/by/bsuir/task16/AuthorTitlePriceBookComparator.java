package main.by.bsuir.task16;

import main.by.bsuir.task12.Book;

import java.util.Comparator;

public class AuthorTitlePriceBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int result = new AuthorTitleBookComparator().compare(book1, book2);
        if (result == 0) {
            result = new PriceBookComparator().compare(book1, book2);
        }
        return result;
    }
}
