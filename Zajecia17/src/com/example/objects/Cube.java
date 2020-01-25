package com.example.objects;

public class Cube extends Prism {
    double a;

    Cube(double a) {
        this.a = a;

        evaluateField();
        evaluateVolume();
    }

    @Override
    protected void evaluateField() {
        this.bottomField = a * a;
    }

    @Override
    protected void evaluateVolume() {
        this.volume = a * a * a;
    }

    @Override
    String getFigureInfo() {
        return "Cube";
    }
}
