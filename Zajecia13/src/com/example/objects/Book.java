package com.example.objects;

public class Book {
    String title;
    String author;
    Integer pages;
    Double price;

    private Book(){
    }

    Book(String title, String author, Integer pages, Double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }
}
