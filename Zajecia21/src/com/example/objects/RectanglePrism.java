package com.example.objects;

public class RectanglePrism extends Figure3D{
    RectanglePrism(double a,double b, double h){
        bottom = new Bottom(a*b);
        this.h = h;
    }

    @Override
    void evaluateVolume() {
        volume = bottom.getField()*h;
    }
}
