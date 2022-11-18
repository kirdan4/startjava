package com.startjava.graduationProject;

public class Book {
    private String author;
    private final String title;
    private int yearOfPublication;

    public Book(String title) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Книга не добавлена.\nУ книги должно быть название.");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + yearOfPublication;
    }
}