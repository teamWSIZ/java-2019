package com.example.objects;

public class Cube extends Prism {
    double a;

    Cube(double a) {
        this.a = a;

        evaluateField();
        evaluateVolume();
    }

    @Override
    void evaluateField() {
        this.field = a * a;
    }

    @Override
    void evaluateVolume() {
        this.volume = a * a * a;
    }

    @Override
    String getFigureInfo() {
        return "Cube";
    }
}
