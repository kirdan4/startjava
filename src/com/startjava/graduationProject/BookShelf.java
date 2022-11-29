package com.startjava.graduationProject;

import java.util.Arrays;

public class BookShelf {
    static final int LIMIT_BOOKS = 10;
    private final Book[] books = new Book[LIMIT_BOOKS];
    private int numberOfBooks;

    public Book[] getBookShelf() {
        return Arrays.copyOf(books, LIMIT_BOOKS);
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public boolean isFreeSpace() {
        return numberOfBooks < LIMIT_BOOKS;
    }

    public void addBook(Book book) {
        books[numberOfBooks] = book;
        numberOfBooks++;
    }

    public Book foundBook(String searchedBook) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equals(searchedBook)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBook(String searchedBook) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equals(searchedBook)) {
                numberOfBooks--;
                System.arraycopy(books, (i + 1), books, i, numberOfBooks - i);
                books[numberOfBooks] = null;
            }
        }
    }

    public int getFreeSpaceOnBookshelf() {
        return (books.length - numberOfBooks);
    }

    public void cleanBookShelf() {
        Arrays.fill(books, 0, numberOfBooks, null);
        numberOfBooks = 0;
        System.out.println("Книжная полка очищена.");
    }
}