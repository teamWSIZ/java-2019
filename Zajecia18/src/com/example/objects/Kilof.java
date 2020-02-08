package com.example.objects;

public class Kilof extends NarzedzieTnace implements Wyczysc, Sprzedaj {
    @Override
    boolean uzyj() {
        return false;
    }

    @Override
    public void reklamuj() {

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
        return false;
    }
}
