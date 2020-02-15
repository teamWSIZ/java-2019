package com.example.objects;

public class Cube extends Figure3D{
    Cube(double a){
        h = a;
        bottom = new Bottom(a*a);
    }

    @Override
    void evaluateVolume() {
        volume = bottom.getField()*h;
    }
}
