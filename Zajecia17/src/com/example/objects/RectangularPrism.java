package com.example.objects;

public class RectangularPrism extends Prism {
    double a, b, c;

    RectangularPrism(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        evaluateBottomField();
        evaluateVolume();

    }

    @Override
    protected String info() {
        return "Funkcja z RectangularPrism";
    }

    @Override
    protected void evaluateBottomField() {
        this.bottomField = a * b;
    }

    @Override
    protected void evaluateVolume() {
        this.volume = a * b * c;
    }

    @Override
    protected void evaluateField() {

    }

    @Override
    String getFigureInfo() {
        return "Rectangular Prism";
    }
}
