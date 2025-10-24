package org.example.ch45.ex10;

public class Book {

    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + " written by " + author + " with ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn != null && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

}
