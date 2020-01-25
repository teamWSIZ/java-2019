package com.example.objects;

import java.util.ArrayList;

public class Main {
    static ArrayList<Czworokat> czworokaty = new ArrayList<>();

    public static void main(String[] args) {
	    Czworokat czworokat = new Czworokat();
	    czworokat.obliczPole();

	    for(int i=0;i<10;i++)
	        czworokaty.add(new Czworokat());

	    for(Czworokat c : czworokaty)
	        c.wyswietl();
    }
}
