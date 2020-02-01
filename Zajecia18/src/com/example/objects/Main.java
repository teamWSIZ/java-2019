package com.example.objects;

import java.util.ArrayList;

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
    }

    public static void uzyj(ArrayList<NarzedzieTnace> narzedzia){
        narzedzia.forEach(narzedzieTnace -> narzedzieTnace.uzyj());
    }

    public static void wyczysc(ArrayList<Wyczysc> przedmioty){

    }
}
