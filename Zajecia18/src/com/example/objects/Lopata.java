package com.example.objects;

public class Lopata extends NarzedzieTnace implements Wyczysc{
    @Override
    boolean uzyj() {
        System.out.println(getClass().getSimpleName()+"Kopie rowy");
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
        System.out.println("Łopaty zwykle nie polerujemy...");
        return false;
    }
}
