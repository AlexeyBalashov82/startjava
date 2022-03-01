package com.startjava.bookshelf;

public class BookShelf {
    private final Book[] books = new Book[10];
    private int booksInShelf = 0;

    private boolean isValidSlot(int position, boolean isEmptyFlag) {
        if ((position >= 10) || (position < 0)) {
            System.out.println("Out of range");
            return false || isEmptyFlag;
        }
        return books[position] == null;
    }

    public void addBook(Book book) {
        if (countSlots() == 0) {
            System.out.println("No more slots!");
        } else {
            for (int i = 0; i < books.length; i++) {
                if (isValidSlot(i, true)) {
                    books[i] = new Book(book);
                    booksInShelf++;
                    System.out.println("Book added at " + i);
                    break;
                }
            }
        }
    }

    public void addBook(Book book, int position) {
        if (isValidSlot(position, true)) {
            books[position] = new Book(book);
            booksInShelf++;
            System.out.println("Book added at " + position);
        } else {
            System.out.println("Can not add book at this position: " + position);
        }
    }

    public void deleteBook(Book book) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].equals(book)) {
                    books[i] = null;
                    booksInShelf--;
                    count++;
                }
            }
        }
        System.out.println("Books deleted count: " + count);
    }

    public void deleteBook(int position) {
        if (!isValidSlot(position, true)) {
            books[position] = null;
            booksInShelf--;
            System.out.println("Book deleted at " + position);
        } else {
            System.out.println("Can not delete book at position: " + position);
        }
    }

    public void moveBook(int currPosition, int newPosition) {
        if (isValidSlot(currPosition, false)) {
            System.out.println("There is no book at " + currPosition);
        } else if (!isValidSlot(newPosition, false)) {
            System.out.println("Can not move book to position: " + newPosition);
        } else {
            books[newPosition] = books[currPosition];
            books[currPosition] = null;
        }
    }

    public void searchBooks(String name) {
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
        return booksInShelf;
    }

    public int countSlots() {
        return 10 - booksInShelf;
    }

    public void showBookData(int position) {
        if (isValidSlot(position, true)) {
            System.out.println("No book at this position!");
        } else {
            System.out.println(books[position].toString());
        }
    }

    public void printBookShelf() {
        for (Book book : books) {
            if (book == null) {
                System.out.print("| |");
            } else {
                System.out.print(book.getName().charAt(0) + "|");
            }
        }
        System.out.println("");
    }
}
