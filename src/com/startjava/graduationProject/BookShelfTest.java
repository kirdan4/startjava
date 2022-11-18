package com.startjava.graduationProject;

import java.util.Scanner;

public class BookShelfTest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        BookShelfFeatures.start(bookShelf, scan);
    }
}