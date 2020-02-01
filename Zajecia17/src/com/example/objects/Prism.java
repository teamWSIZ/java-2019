package com.example.objects;

abstract public class Prism {
    double bottomField;
    double volume;

    abstract protected void evaluateBottomField();
    abstract protected void evaluateVolume();

    abstract String getFigureInfo();

    protected String info(){
        return "Prism - funkcja z klasy bazowej";
    }

    void print(){
        System.out.println(info());

        System.out.println(getFigureInfo());
        System.out.println("Pole powierzchni: "+ bottomField);
        System.out.println("Objetosc: "+volume);
    }
}
