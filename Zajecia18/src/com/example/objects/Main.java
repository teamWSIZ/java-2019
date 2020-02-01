package com.example.objects;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<NarzedzieTnace> narzedzia = new ArrayList<>();

        narzedzia.add(new Lopata());
        narzedzia.add(new Lopata());
        narzedzia.add(new Noz());
        narzedzia.add(new Noz());
        narzedzia.add(new Siekiera());

        uzyj(narzedzia);
    }

    public static void uzyj(ArrayList<NarzedzieTnace> narzedzia){
        narzedzia.forEach(narzedzieTnace -> narzedzieTnace.uzyj());
    }
}
