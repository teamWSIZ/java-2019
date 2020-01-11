package com.example.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> tablica = new ArrayList<>();
	    dodajLiczby(tablica,10);

	    wyswietlTablice(tablica);

	    tablica.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return 1;
                if(o1<o2)
                    return -1;

                return 0;
            }
        });

        wyswietlTablice(tablica);

        tablica.sort((o1,o2)->{
            if(o1>o2)
                return -1;
            if(o1<o2)
                return 1;

            return 0;
        });

        wyswietlTablice(tablica);

        //Nietypowe sortowanie
        tablica.sort((o1,o2)->{
            if(o1+o2>o2)
                return -1;
            if(o1*o2<o1)
                return 1;

            return 0;
        });

        wyswietlTablice(tablica);
    }

    public static void dodajLiczby(ArrayList<Integer> tab, int no){
        for(int i=0;i<no;i++)
            tab.add((int)(Math.random()*10));
    }

    public static void wyswietlTablice(ArrayList<Integer> tab){
        System.out.print("[");

        for(int i=0;i<tab.size();i++) {
            if (i < tab.size() - 1)
                System.out.print(tab.get(i) + ", ");
            else
                System.out.print(tab.get(i));
        }
        System.out.println("]");

    }
}
