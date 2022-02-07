package com.startjava.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private Book[] books = new Book[10];

    private boolean isEmptySlot(int position) {
        return books[position] == null;
    }

    public void addBook(Book book) {
        if (countSlots() == 0) {
            System.out.println("No more slots!");

        } else {
            for (int i = 0; i < 10; i++) {
                if (isEmptySlot(i)) {
                    books[i] = new Book(book);
                    System.out.println("Book added at " + i);
                    break;
                }
            }
        }
    }

    public void addBook(Book book, int position) {
        if (isEmptySlot(position)) {
            books[position] = new Book(book);
            System.out.println("Book added at " + position);
        } else {
            System.out.println("Can not add book at not empty position: " + position);
        }
    }

    public void deleteBook(Book book) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (books[i] != null) {
                if (books[i].isEqual(book)) {
                    books[i] = null;
                    count++;
                }
            }
        }
        System.out.println("Books deleted count: " + count);
    }

    public void deleteBook(int position) {
        if (!isEmptySlot(position)) {
            books[position] = null;
            System.out.println("Book deleted at " + position);
        } else {
            System.out.println("Can not delete book at not empty position: " + position);
        }
    }

    public void moveBook(int currPosition, int newPosition) {
        if (isEmptySlot(currPosition)) {
            System.out.println("There is no book at " + currPosition);
        } else if (!isEmptySlot(newPosition)) {
            System.out.println("Can not move book to a busy possiotion: " + newPosition);
        } else {
            books[newPosition] = new Book(books[currPosition]);
            books[currPosition] = null;
        }
    }

    public void searchBooks(String name) {
        boolean wasFound = false;
        for (Book book : books) {
            if (book != null) {
                if (name.equals(book.getName())) {
                    wasFound = true;
                    System.out.println("Book found: " + book.getBookData());
                }
            }
        }
        if (!wasFound) {
            System.out.println("No books found with name: " + name);
        }
    }

    public int countBooks() {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }

    public int countSlots() {
        int count = 0;
        for (Book book : books) {
            if (book == null) {
                count++;
            }
        }
        return count;
    }

    public void showBookData(int position) {
        if (isEmptySlot(position)) {
            System.out.println("No book at this position!");
        } else {
            System.out.println(books[position].getBookData());
        }
    }

    public void printBookShelf() {
        String result = "";
        for (Book book : books) {
            result += (book == null) ? "| |" : book.showCover();
        }
        System.out.println(result);
    }
}
