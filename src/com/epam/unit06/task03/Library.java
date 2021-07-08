package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void add(Book b) {
        books.add(b);
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<Book>();

        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> findByAfterXYearPublished(int year) {
        List<Book> result = new ArrayList<Book>();

        for (Book b : books) {
            if (b.getYearPublished() > year) {
                result.add(b);
            }
        }
        return result;

    }
}

