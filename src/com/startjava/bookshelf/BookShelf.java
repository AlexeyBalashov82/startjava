package com.startjava.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private final Book[] books = new Book[10];

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
            books[newPosition] = books[currPosition];
            books[currPosition] = null;
        }
    }

    public void searchBooks(String name) {
/*        if (Arrays.stream(books).filter((Book book) -> {
            if (book == null) {
                return false;
            } else {
                return book.getName().equals(name);
            }
        }).peek((Book book) -> {
            System.out.println(book);
        }).count() == 0) {
            System.out.println("Books not found: " + name);
        } */
        boolean isBookFound = false;
        for (Book book : books) {
            if (book != null) {
                if (book.getName().equals(name)) {
                    isBookFound = true;
                    System.out.println(book);
                }
            }
        }
        if (!isBookFound) {
            System.out.println("Books not found: " + name);
        }
    }

    public int countBooks() {
        //       return (int) Arrays.stream(books).filter(b -> b != null).count();
        int i = 0;
        for (Book book : books) {
            if (book != null)
                i++;
        }
        return i;
    }

    public int countSlots() {
        //   return (int) Arrays.stream(books).filter(b -> b == null).count();
        int i = 0;
        for (Book book : books) {
            if (book == null)
                i++;
        }
        return i;
    }

    public void showBookData(int position) {
        if (isEmptySlot(position)) {
            System.out.println("No book at this position!");
        } else {
            System.out.println(books[position].toString());
        }
    }

    public void printBookShelf() {
        String result = "";
        for (Book book : books) {
            result += (book == null) ? "| |" : showBookCover(book);
        }
        System.out.println(result);
    }

    private String showBookCover(Book book) {
        return "|" + book.getName().charAt(0) + "|";
    }
}
