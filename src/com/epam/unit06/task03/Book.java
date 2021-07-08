package com.epam.unit06.task03;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishHouse;
    private int yearPublished;
    private int quantityPages;
    private int price;
    private String bindingType;

    public Book(int id, String title, String author, String publishHouse, int yearPublished, int quantityPages, int price, String bindingType) {
        this.id=id;
        this.title = title;
        this.author = author;
        this.publishHouse = publishHouse;
        this.yearPublished = yearPublished;
        this.quantityPages = quantityPages;
        this.price = price;
        this.bindingType=bindingType;
    }

    public Book(String title, String author, int yearPublished, int price) {
        super();
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished, price);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + ", price=" + price
                + "]";
    }
}