package com.example.objects;

public class Garnek extends Naczynie implements Wyczysc, Sprzedaj{
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
        System.out.println("Polerujemy garnek...");
        return false;
    }

    @Override
    public void reklamuj() {
        System.out.println("Reklamuję garnek");
    }
}
