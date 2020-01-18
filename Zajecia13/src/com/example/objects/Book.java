package com.example.objects;

public class Book {
    private String title;
    private String author;
    private Integer pages;
    private Integer price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getPrice() {
        return price;
    }

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
