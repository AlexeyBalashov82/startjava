package com.startjava.bookshelf;

import java.util.HashMap;

public class Book {
    private String author;
    private String name;
    private int publishingYear;

    public Book(Book book) {
        this.author = book.getAuthor();
        this.name = book.getName();
        this.publishingYear = book.getPublishingYear();
    }

    public Book(String author, String name, int publishingYear) {
        this.author = author;
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String showCover() {
        return "|"+String.valueOf(name.charAt(0))"|";
    }

    public HashMap<String, String> getBookData() {
        HashMap<String, String> book = new HashMap<>();
        book.put("author", author);
        book.put("name", name);
        book.put("published", String.valueOf(publishingYear));
        return book;
    }

    public boolean isEqual(Book book) {
        return ((author == book.author) && (name == book.name) && (publishingYear == book.publishingYear));
    }
}
