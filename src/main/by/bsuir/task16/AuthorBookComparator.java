package main.by.bsuir.task16;

import main.by.bsuir.task12.Book;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
