package com.startjava.graduationProject;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Книга не добавлена.\nУ книги должно быть название.");
        }
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearOfPublication;
    }
}