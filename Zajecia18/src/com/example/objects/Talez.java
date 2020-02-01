package com.example.objects;

public class Talez extends Naczynie implements Wyczysc{
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
