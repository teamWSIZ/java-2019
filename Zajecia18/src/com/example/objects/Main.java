package com.example.objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<NarzedzieTnace> narzedzia = new ArrayList<>();
        ArrayList<Naczynie> naczynia = new ArrayList<>();

        narzedzia.add(new Lopata());
        narzedzia.add(new Lopata());
        narzedzia.add(new Noz());
        narzedzia.add(new Noz());
        narzedzia.add(new Siekiera());

        naczynia.add(new Garnek());
        naczynia.add(new Talez());

        uzyj(narzedzia);

        ArrayList<Wyczysc> przedmioty = new ArrayList<>();

        Sprzedaj garnek0 = new Garnek();
        Sprzedaj garnek1 = new Garnek();
        Set<Sprzedaj> przedmiotyNaSprzedaz = new HashSet<>();

        przedmiotyNaSprzedaz.add(garnek0);
        przedmiotyNaSprzedaz.add(garnek0);
        przedmiotyNaSprzedaz.add(garnek0);
        przedmiotyNaSprzedaz.add(garnek0);
        przedmiotyNaSprzedaz.add(garnek1);
        przedmiotyNaSprzedaz.add(garnek1);

        System.out.println("_______________________");
        przedmiotyNaSprzedaz.forEach(przedmiot->przedmiot.reklamuj());
        System.out.println("_______________________");

        for(NarzedzieTnace narzedzie : narzedzia)
            przedmioty.add((Wyczysc)narzedzie);

        naczynia.forEach(naczynie -> przedmioty.add((Wyczysc)naczynie));

        wyczysc(przedmioty);
    }

    public static void uzyj(ArrayList<NarzedzieTnace> narzedzia){
        narzedzia.forEach(narzedzieTnace -> narzedzieTnace.uzyj());
    }

    public static void wyczysc(ArrayList<Wyczysc> przedmioty){
        for(Wyczysc przedmiot : przedmioty) {
            przedmiot.uzyjPlynuDoCzyszczenia();
            przedmiot.przepluczWoda();
            przedmiot.wypoleruj();
            przedmiot.przepluczWoda();
        }
    }
}
