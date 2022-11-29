package com.startjava.graduationProject;

import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookShelf bookShelf = new BookShelf();
        String reply;
        do {
            printBookShelf(bookShelf);
            printMenu();
            reply = scan.nextLine();
            menu(bookShelf, scan, reply);
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

    private static void menu(BookShelf bookShelf, Scanner scan, String reply) {
        switch (reply) {
            case "1" -> addBook(bookShelf, scan);
            case "2" -> findBook(bookShelf, scan);
            case "3" -> deleteBook(bookShelf, scan);
            case "4" -> printNumberOfBooks(bookShelf);
            case "5" -> printFreeSpaceOnBookshelf(bookShelf);
            case "6" -> bookShelf.cleanBookShelf();
            case "7" -> System.out.println("До свидания.");
            default -> System.out.println("Введено некорректное значение!");
        }
    }

    private static void printBookShelf(BookShelf bookShelf) {
        System.out.printf("В шкафу %d книги, свободно %d полок.\n", bookShelf.getNumberOfBooks(), bookShelf.getFreeSpaceOnBookshelf());
        Book[] books = bookShelf.getBookShelf();
        for (Book book : books) {
            if (bookShelf.getNumberOfBooks() == 0) {
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

    private static void addBook(BookShelf bookShelf, Scanner scan) {
        if (bookShelf.isFreeSpace()) {
            System.out.println("Введите название книги, автора и год издания книги (через Enter):");
            try {
                bookShelf.addBook(new Book(scan.nextLine(), scan.nextLine(), (Integer.parseInt(scan.nextLine()))));
            } catch (NumberFormatException e) {
                System.out.println("Книга не добавлена.\nВведенное значение (год издания книги) не является числом.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("На полке больше нет места.");
        }
    }

    private static void findBook(BookShelf bookShelf, Scanner scan) {
        System.out.println("Введите название книги:");
        String searchedBook = scan.nextLine();
        if (bookShelf.foundBook(searchedBook) == null) {
            System.out.println("Книги с таким названием нет на полке.");
        } else {
            System.out.print("----------------------------------\n");
            System.out.print("|" + bookShelf.foundBook(searchedBook) + "      |\n");
            System.out.print("----------------------------------\n");
        }
    }

    private static void deleteBook(BookShelf bookShelf, Scanner scan) {
        System.out.println("Введите название книги которую хотите удалить:");
        String searchedBook = scan.nextLine();
        if (bookShelf.foundBook(searchedBook) == null) {
            System.out.println("Книги с таким названием нет на полке.");
        } else {
            bookShelf.deleteBook(searchedBook);
            System.out.println("Книга успешно удалена.");
        }
    }

    private static void printNumberOfBooks(BookShelf bookShelf) {
        System.out.printf("На полке %d книг.\n", bookShelf.getNumberOfBooks());
    }

    private static void printFreeSpaceOnBookshelf(BookShelf bookShelf) {
        System.out.printf("На полке %d свободных мест.\n", bookShelf.getFreeSpaceOnBookshelf());
    }
}

