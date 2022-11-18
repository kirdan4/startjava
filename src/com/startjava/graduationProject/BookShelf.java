package com.startjava.graduationProject;

import java.util.Arrays;

public class BookShelf {
    private final Book[] books = new Book[10];
    private int numberOfBooks;

    public Book[] getBookShelf() {
        return books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public boolean isFreeSpace() {
        return numberOfBooks <= 9;
    }

    public void addBook(String title, String author, String yearOfPublication) {
        books[numberOfBooks] = new Book(title);
        books[numberOfBooks].setAuthor(author);
        try {
            books[numberOfBooks].setYearOfPublication(Integer.parseInt(yearOfPublication));
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение (год издания книги) не является числом.");
        }
        numberOfBooks++;
    }

    public boolean isBookFound(String searchedBook) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getTitle().equals(searchedBook)) {
                return false;
            }
        }
        return true;
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