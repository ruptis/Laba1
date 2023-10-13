package main.by.bsuir.task13;

import main.by.bsuir.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public ProgrammerBook(Book book, String language, int level) {
        super(book);
        this.language = language;
        this.level = level;
    }

    public ProgrammerBook() {
        this("", "", 0, 0, "", 0);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", language=" + language
                + ", level=" + level;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + level;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj == this) ||
                (obj instanceof ProgrammerBook book) &&
                        (super.equals(book)) &&
                        book.level == level &&
                        Objects.equals(book.language, language);
    }
}
