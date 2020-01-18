package com.example.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book = new Book("Java", "jakis autor", 200, 50);
        Book book1 = new Book("Java1", "kolejny autor", 250, 100);

        books.add(book);
        books.add(book1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilość książek: ");

        dodajKsiazki(books, scanner.nextInt());

        for (Book b0 : books) {
            b0.print();
        }

        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {

                if (o1.getPrice() > o2.getPrice())
                    return 1;

                if (o2.getPrice() > o1.getPrice())
                    return -1;

                return 0;
            }
        });

        for (Book b0 : books) {
            b0.printPrice();
        }

        books.sort((o1, o2) -> {
            if (o1.getPages() > o2.getPages())
                return 1;

            if (o2.getPages() > o1.getPages())
                return -1;

            return 0;
        });
        
    }

    public static void dodajKsiazki(ArrayList<Book> ksiazki, Integer no) {
        for (Integer i = 0; i < no; i++)
            ksiazki.add(new Book("Java_" + i.toString(), "jakis autor", 200, (int) (Math.random() * 20) + 20));
    }
}
