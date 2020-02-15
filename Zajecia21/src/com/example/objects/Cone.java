package com.example.objects;

public class Cone extends Figure3D{

    Cone(double r, double h){
        this.h = h;
        bottom = new Bottom(Math.PI*r*r);
    }

    @Override
    void evaluateVolume() {
        volume = 1.0/3.0*bottom.getField()*h;
    }
}
