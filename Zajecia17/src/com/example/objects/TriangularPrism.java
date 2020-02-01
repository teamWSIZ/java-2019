package com.example.objects;

public class TriangularPrism extends Prism {
    double a;
    double h;

    TriangularPrism(double a, double h) {
        this.a = a;
        this.h = h;

        evaluateField();
        evaluateVolume();
    }

    @Override
    protected void evaluateField() {
        bottomField = a * a * Math.sqrt(3.0) / 4.0;
    }

    @Override
    protected void evaluateVolume() {
        volume = bottomField * h;
    }

    @Override
    String getFigureInfo() {
        return "Triangular prism";
    }
}
