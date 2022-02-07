package com.startjava.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    private static BookShelf bookShelf = new BookShelf();
    private static Scanner console = new Scanner(System.in);
    private static Book currentBook;

    public static void main(String[] args) {
        while (true) {
            if (!mainMenu()) {
                break;
            }
        }
    }

    private static boolean mainMenu() {
        int menuItem;

        System.out.println("Enter your choice: ");
        System.out.println("1. Add book.");
        System.out.println("2. Delete book.");
        System.out.println("3. Move book.");
        System.out.println("4. Search books.");
        System.out.println("5. Count books.");
        System.out.println("6. Count slots.");
        System.out.println("7. Show book details.");
        System.out.println("8. Print bookshelf.");
        System.out.println("0. Exit");

        menuItem = console.nextInt();
        console.nextLine();

        switch (menuItem) {
            case 1 -> addBookMenu();
            case 2 -> deleteBookMenu();
            case 3 -> moveBook();
            case 4 -> searchBooks();
            case 5 -> showBooksCount();
            case 6 -> showSlotsCount();
            case 7 -> showBookData();
            case 8 -> printBookShelf();
            case 0 -> {
                return false;
            }
        }
        printBookShelf();
        return true;
    }

    private static void addBookMenu() {
        int menuItem;

        System.out.println("You want to add the book: ");
        System.out.println("1. At the tail of the shelf.");
        System.out.println("2. At exact position");
        menuItem = console.nextInt();
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
        }

    }

    private static void deleteBookMenu() {
        System.out.println("Delete menu");
    }

    private static void moveBook() {
        System.out.println("Move menu");
    }

    private static void searchBooks() {
        System.out.println("search menu");
    }

    private static void showBooksCount() {
        System.out.println("BC menu");
    }

    private static void showSlotsCount() {
        System.out.println("SC menu");
    }

    private static void showBookData() {
        System.out.println("Data menu");
    }

    private static void setBookData() {
        String author;
        String name;
        int publishingYear;

        System.out.println("Enter author: ");
        author = console.nextLine();
        ;
        System.out.println("Enter book name: ");
        name = console.nextLine();
        System.out.println("Enter year of publishing: ");
        publishingYear = console.nextInt();
        console.nextLine();

        currentBook = null;
        currentBook = new Book(author, name, publishingYear);
    }

    private static void printBookShelf() {
        bookShelf.printBookShelf();
    }


}
