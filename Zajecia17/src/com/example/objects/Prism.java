package com.example.objects;

abstract public class Prism {
    double field;
    double volume;

    abstract void evaluateField();
    abstract void evaluateVolume();

    abstract String getFigureInfo();

    Prism(){
        evaluateField();
        evaluateVolume();
    }

    void print(){
        System.out.println(getFigureInfo());
        System.out.println("Pole powierzchni: "+field);
        System.out.println("Objetosc: "+volume);
    }
}
