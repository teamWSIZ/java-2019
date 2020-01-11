package com.example.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book = new Book("Java", "jakis autor", 200, 50.0);
        Book book1 = new Book("Java1", "kolejny autor", 250, 100.0);

        books.add(book);
        books.add(book1);

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Ilość książek: ");

        dodajKsiazki(books, scanner.nextInt());

        for (Book b0 : books) {
            b0.print();
        }
    }

    public static void dodajKsiazki(ArrayList<Book> ksiazki, Integer no) {
        for (Integer i = 0; i < no; i++)
            ksiazki.add(new Book("Java_" + i.toString(), "jakis autor", 200, 50.0 + i));
    }
}
