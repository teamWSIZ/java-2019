package com.example.objects;

public class TrapezoidPrism extends Prism {

    double a, b, h, H;
    double bottomField;
    double volume;

    TrapezoidPrism(double a, double b, double h, double H) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.H = H;

        evaluateBottomField();
        evaluateVolume();
    }

    @Override
    protected void evaluateBottomField() {
        bottomField = 1.0 / 2.0 * (a + b) * h;
    }

    @Override
    protected void evaluateVolume() {
        volume = bottomField * H;
    }

    @Override
    String getFigureInfo() {
        return "Trapezoid Prism";
    }
}
