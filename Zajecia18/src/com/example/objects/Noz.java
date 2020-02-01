package com.example.objects;

public class Noz extends NarzedzieTnace implements Wyczysc{
    @Override
    boolean uzyj() {
        System.out.println("Kroi chleb");
        return true;
    }

    @Override
    public boolean uzyjPlynuDoCzyszczenia() {
        return false;
    }

    @Override
    public boolean przepluczWoda() {
        return false;
    }

    @Override
    public boolean wypoleruj() {
        System.out.println("Poleruję nóż...");
        return false;
    }
}
