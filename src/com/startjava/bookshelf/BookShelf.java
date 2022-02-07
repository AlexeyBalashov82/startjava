package com.startjava.bookshelf;

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
        System.out.println("Add book at " + position);
    }

    public void deleteBook(Book book) {
        System.out.println("Delete books");
    }

    public void deleteBook(int position) {
        System.out.println("Delete book at " + position);
    }

    public void moveBook(int currPosition, int newPositiob) {
        System.out.println("Moved");
    }

    public Book[] searchBooks(String author, String name, Integer publishingYear) {

        return new Book[0];
    }


    public boolean moveBook(Book book, int newPosition) {
        return true;
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

    public void printBookShelf() {
        String result = "";
        for (Book book : books) {
            result += (book == null) ? "| |" : book.showCover();
        }
        System.out.println(result);
    }


}
