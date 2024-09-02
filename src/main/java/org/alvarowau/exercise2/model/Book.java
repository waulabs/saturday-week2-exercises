package org.alvarowau.exercise2.model;

import java.util.Objects;

/**
 * Represents a book with a title, author, and ISBN.
 */
public class Book {
    private String title;
    private String author;
    private final String ISBN;
    private StatusBook status;


    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.status = StatusBook.AVAILABLE;
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


    public String getISBN() {
        return ISBN;
    }

    public StatusBook getStatus() {
        return status;
    }

    public void setStatus(StatusBook status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(ISBN, book.ISBN) && status == book.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, ISBN, status);
    }

    @Override
    public String toString() {
        return String.format("Título: '%s', Autor: '%s', ISBN: '%s', Estado: %s", title, author, ISBN, status);
    }


}