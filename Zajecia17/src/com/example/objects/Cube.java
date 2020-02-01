package com.example.objects;

public class Cube extends Prism {
    double a;

    Cube(double a) {
        this.a = a;

        evaluateBottomField();
        evaluateVolume();
    }

    @Override
    protected void evaluateBottomField() {
        this.bottomField = a * a;
    }

    @Override
    protected void evaluateVolume() {
        this.volume = a * a * a;
    }

    @Override
    protected void evaluateField() {
        field = 6*a*a;
    }

    @Override
    String getFigureInfo() {
        return "Cube";
    }
}
