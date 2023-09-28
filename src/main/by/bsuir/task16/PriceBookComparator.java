package main.by.bsuir.task16;

import main.by.bsuir.task12.Book;

import java.util.Comparator;

public class PriceBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}
