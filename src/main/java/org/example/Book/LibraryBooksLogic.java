package org.example.Book;

import java.util.Scanner;

@SuppressWarnings("ALL") // (убирает подсвечивание вайла, так как цикл бесконечный идея предлагает выкинуть ошибку, ошибочное подсказывание)))
public class LibraryBooksLogic {
    static String booksInfo = "";

    public static void start() {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = inputBookPrice();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, bookPrice);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static double inputBookPrice() {
        System.out.println("Введите цену книги: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) { //гибкий метод
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) { //гибкий метод
        addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. " + (bookPrice > 0 ? bookPrice + " руб." : "Уточните цену у продавца!\n");

    }


    public static void printInfo() {
        System.out.println(booksInfo);
    }
}