package com.startjava.graduationProject;

import java.util.Scanner;

public class BookShelfTest {

    private static final BookShelf BOOK_SHELF = new BookShelf();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reply;
        do {
            printBookShelf();
            printMenu();
            reply = scan.nextLine();
            menu(scan, reply);
            String reply2;
            do {
                System.out.println("Для продолжения работы нажмите Enter.");
                reply2 = scan.nextLine();
            } while (!"".equals(reply2));
        } while (!"7".equals(reply));
    }

    private static void printMenu() {
        System.out.println("""
                \nВведите соответствующую цифру:
                1. Добавить книгу.
                2. Найти книгу.
                3. Удалить книгу.
                4. Вывести количество книг на полке.
                5. Вывести количество свободного места на полке.
                6. Очистить полку.
                7. Выйти.""");
    }

    private static void menu(Scanner scan, String reply) {
        switch (reply) {
            case "1" -> addBook(scan);
            case "2" -> findBook(scan);
            case "3" -> deleteBook(scan);
            case "4" -> printNumberOfBooks();
            case "5" -> printFreeSpaceOnBookshelf();
            case "6" -> BookShelfTest.BOOK_SHELF.cleanBookShelf();
            case "7" -> System.out.println("До свидания.");
            default -> System.out.println("Введено некорректное значение!");
        }
    }

    private static void printBookShelf() {
        System.out.printf("В шкафу %d книги, свободно %d полок.\n",
                BookShelfTest.BOOK_SHELF.getNumberOfBooks(),
                BookShelfTest.BOOK_SHELF.getFreeSpaceOnBookshelf());
        Book[] books = BookShelfTest.BOOK_SHELF.getBookShelf();
        for (Book book : books) {
            if (BookShelfTest.BOOK_SHELF.getNumberOfBooks() == 0) {
                System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
                break;
            } else if (book != null) {
                System.out.print("|" + book + "      |\n");
                System.out.print("|-------------------------------|\n");
            } else {
                System.out.println("|                               |");
                System.out.print("|-------------------------------|\n");
                break;
            }
        }
    }

    private static void addBook(Scanner scan) {
        if (BookShelfTest.BOOK_SHELF.isFreeSpace()) {
            System.out.println("Введите название книги, автора и год издания книги (через Enter):");
            try {
                BookShelfTest.BOOK_SHELF.addBook(new Book(scan.nextLine(), scan.nextLine(),
                        (Integer.parseInt(scan.nextLine()))));
            } catch (NumberFormatException e) {
                System.out.println("Книга не добавлена.\nВведенное значение (год издания книги) " +
                        "не является числом.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("На полке больше нет места.");
        }
    }

    private static void findBook(Scanner scan) {
        System.out.println("Введите название книги:");
        String searchedBook = scan.nextLine();
        if (BookShelfTest.BOOK_SHELF.foundBook(searchedBook) == null) {
            System.out.println("Книги с таким названием нет на полке.");
        } else {
            System.out.print("----------------------------------\n");
            System.out.print("|" + BookShelfTest.BOOK_SHELF.foundBook(searchedBook) + "      |\n");
            System.out.print("----------------------------------\n");
        }
    }

    private static void deleteBook(Scanner scan) {
        System.out.println("Введите название книги которую хотите удалить:");
        String searchedBook = scan.nextLine();
        if (BookShelfTest.BOOK_SHELF.foundBook(searchedBook) == null) {
            System.out.println("Книги с таким названием нет на полке.");
        } else {
            BookShelfTest.BOOK_SHELF.deleteBook(searchedBook);
            System.out.println("Книга успешно удалена.");
        }
    }

    private static void printNumberOfBooks() {
        System.out.printf("На полке %d книг.\n", BookShelfTest.BOOK_SHELF.getNumberOfBooks());
    }

    private static void printFreeSpaceOnBookshelf() {
        System.out.printf("На полке %d свободных мест.\n",
                BookShelfTest.BOOK_SHELF.getFreeSpaceOnBookshelf());
    }
}

