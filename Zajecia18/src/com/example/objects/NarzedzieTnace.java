package com.example.objects;

abstract public class NarzedzieTnace {
    private Ostrze ostrze;
    private Rekojesc rekojesc;

    abstract boolean uzyj();

    public double getDlugosc() {
        return ostrze.getDlugosc() + rekojesc.getDlugosc();
    }
}
