package com.example.objects;

public class Book {
    String title;
    String author;
    Integer pages;
    Integer price;

    private Book(){
    }

    Book(String title, String author, Integer pages, Integer price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tytuł: "+title+" Autor: "+author+" Liczba stron: "+pages+" Cena: "+price;
    }

    public void print(){
        System.out.println("_____________________");
        System.out.println("Tytuł: "+title);
        System.out.println("Autor: "+author);
        System.out.println("Liczba stron: "+pages);
        System.out.println("Cena: "+price);
        System.out.println("_____________________");
    }

}
