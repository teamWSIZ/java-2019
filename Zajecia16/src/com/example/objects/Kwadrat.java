package com.example.objects;

public class Kwadrat extends Czworokat{
    private double bok = 0;

    Kwadrat(double bok){
        this.bok = bok;
    }

    @Override
    public void obliczPole() {
        polePowierzchni = bok*bok;
    }

    @Override
    public boolean czyPoleZostaloZdefiniowane() {
        return true;
    }
}
