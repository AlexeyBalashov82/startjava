package com.startjava.bookshelf;

import java.util.Objects;

public class Book {
    private String author;
    private String name;
    private int publishingYear;

    public Book(Book book) {
        this(book.getAuthor(), book.getName(), book.getPublishingYear());
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

    @Override
    public String toString() {
        return "Author: " + author + ", name: " + name + ", published at " + String.valueOf(publishingYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && author.equals(book.author) && name.equals(book.name);
    }
}
