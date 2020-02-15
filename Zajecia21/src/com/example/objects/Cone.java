package com.example.objects;

public class Cone extends Figure3D{

    Cone(Bottom bottom){
        this.bottom = bottom;
    }

    @Override
    void evaluateVolume() {
        volume = 1.0/3.0*bottom.getField()*h;
    }
}
