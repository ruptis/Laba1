package main.by.bsuir.task12;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private static int edition;
    private String title;
    private String author;
    private int price;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public Book(Book book) {
        this(book.title, book.author, book.price, book.isbn);
    }

    public Book() {
        this("", "", 0, 0);
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + "title=" + title + ", author=" + author + ", price=" + price + ", edition=" + edition;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + price;
        result = 31 * result + edition;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj == this) ||
                ((obj instanceof Book book) &&
                        (book.price == price) &&
                        Objects.equals(book.title, title) &&
                        Objects.equals(book.author, author));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();
        clone.title = title;
        clone.author = author;
        clone.price = price;
        return clone;
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(isbn, book.isbn);
    }
}
