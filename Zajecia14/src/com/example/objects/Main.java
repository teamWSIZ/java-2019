package com.example.objects;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> tablica = new ArrayList<>();
	    dodajLiczby(tablica,10);

	    wyswietlTablice(tablica);
    }

    public static void dodajLiczby(ArrayList<Integer> tab, int no){
        for(int i=0;i<no;i++)
            tab.add((int)Math.random()*10);
    }

    public static void wyswietlTablice(ArrayList<Integer> tab){
        System.out.print("[");

        for(int i=0;i<tab.size();i++) {
            if (i < tab.size() - 1)
                System.out.print(i + ", ");
            else
                System.out.print(i);
        }
        System.out.println("]");

    }
}
