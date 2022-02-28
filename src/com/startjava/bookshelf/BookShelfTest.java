package com.startjava.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    private static BookShelf bookShelf = new BookShelf();
    private static Scanner console = new Scanner(System.in);
    private static Book currentBook;

    public static void main(String[] args) {
        while (true) {
            if (!startMainMenu()) {
                break;
            }
        }
    }

    private static boolean startMainMenu() {
        printBookShelf();
        System.out.println("Enter your choice: ");
        System.out.println("1. Add book");
        System.out.println("2. Delete book");
        System.out.println("3. Move book");
        System.out.println("4. Search books");
        System.out.println("5. Count books");
        System.out.println("6. Count slots");
        System.out.println("7. Show book details");
        System.out.println("0. Exit");

        int menuItem = console.nextInt();
        console.nextLine();

        switch (menuItem) {
            case 1 -> addBookMenu();
            case 2 -> deleteBookMenu();
            case 3 -> moveBook();
            case 4 -> searchBooks();
            case 5 -> showBooksCount();
            case 6 -> showSlotsCount();
            case 7 -> showBookData();
            case 0 -> {
                return false;
            }
            default -> System.out.println("Unknown operation!");
        }
        return true;
    }

    private static void addBookMenu() {

        System.out.println("You want to add the book: ");
        System.out.println("1. At the tail of the shelf.");
        System.out.println("2. At exact position");
        int menuItem = console.nextInt();
        console.nextLine();
        setBookData();
        switch (menuItem) {
            case 1 -> bookShelf.addBook(currentBook);
            case 2 -> {
                int position;
                System.out.println("Eneter slot number: ");
                position = console.nextInt();
                console.nextLine();
                bookShelf.addBook(currentBook, position);
            }
            default -> System.out.println("Unknown operation!");
        }
    }

    private static void deleteBookMenu() {
        System.out.println("You want to delete: ");
        System.out.println("1. All the same books");
        System.out.println("2. At exact position");
        int menuItem = console.nextInt();
        console.nextLine();
        switch (menuItem) {
            case 1 -> {
                System.out.println("Describe book you want to delete: ");
                setBookData();
                bookShelf.deleteBook(currentBook);
            }
            case 2 -> {
                int position;
                System.out.println("Eneter slot number: ");
                position = console.nextInt();
                console.nextLine();
                bookShelf.deleteBook(position);
            }
            default -> System.out.println("Unknown operation!");
        }
    }

    private static void moveBook() {
        int currPosition;
        int newPosition;
        System.out.println("Enter current book position: ");
        currPosition = console.nextInt();
        console.nextLine();
        System.out.println("Enter new position: ");
        newPosition = console.nextInt();
        console.nextLine();
        bookShelf.moveBook(currPosition, newPosition);
    }

    private static void searchBooks() {
        String name;
        System.out.println("Enter book name to search: ");
        name = console.nextLine();
        bookShelf.searchBooks(name);
    }

    private static void showBooksCount() {
        System.out.println("Books on a bookshelf: " + bookShelf.countBooks());
    }

    private static void showSlotsCount() {
        System.out.println("Empty slots on a bookshelf: " + bookShelf.countSlots());
    }

    private static void showBookData() {
        int position;
        System.out.println("Enter current book position: ");
        position = console.nextInt();
        console.nextLine();
        bookShelf.showBookData(position);
    }

    private static void setBookData() {
        System.out.println("Enter author: ");
        String author = console.nextLine();
        System.out.println("Enter book name: ");
        String name = console.nextLine();
        System.out.println("Enter year of publishing: ");
        int publishingYear = console.nextInt();
        console.nextLine();

        currentBook = new Book(author, name, publishingYear);
    }

    private static void printBookShelf() {
        bookShelf.printBookShelf();
    }
}
