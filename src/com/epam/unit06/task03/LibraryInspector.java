package com.epam.unit06.task03;

public class LibraryInspector {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("Java", "Ekkel", 2003, 300));
        lib.add(new Book("Java", "Ekkel", 2013, 300));
        lib.add(new Book("Java2", "Ekkel2", 2015, 300));
        lib.add(new Book("Java3", "Ekkel3", 2017, 300));
        lib.add(new Book("Java4", "Ekkel4", 2020, 300));
        System.out.println("Books are written by Ekkel - " + lib.findByAuthor("Ekkel"));
        System.out.println("Books are published after 2016 year - " + lib.findByAfterXYearPublished(2016));
    }
}

