package com.example.objects;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();

	    Book book = new Book("Java","jakis autor",200,50.0);
        Book book1 = new Book("Java1","kolejny autor",250,100.0);

        books.add(book);
        books.add(book1);

        dodajKsiazki(books);

        for(int i=0;i<books.size();i++){
        	Book b0 = books.get(i);
        	b0.print();
		}

	    for(Book b0 : books){
	    	b0.print();
		}
    }

    public static void dodajKsiazki(ArrayList<Book> ksiazki){

	}
}
