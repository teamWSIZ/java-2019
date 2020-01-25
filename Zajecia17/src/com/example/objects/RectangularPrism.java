package com.example.objects;

public class RectangularPrism extends Prism {
    double a, b, c;

    RectangularPrism(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        evaluateField();
        evaluateVolume();
    }

    @Override
    void evaluateField() {
        this.field = a * b;
    }

    @Override
    void evaluateVolume() {
        this.volume = a * b * c;
    }

    @Override
    String getFigureInfo() {
        return "Rectangular Prism";
    }
}
