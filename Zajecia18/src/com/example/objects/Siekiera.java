package com.example.objects;

public class Siekiera extends NarzedzieTnace implements Wyczysc{
    @Override
    boolean uzyj() {
        System.out.println("Rąbie drzewo");
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
        System.out.println("Poleruję siekierę...");
        return false;
    }
}
