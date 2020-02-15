package com.example.objects;

abstract public class Figure3D {
    protected Bottom bottom;

    protected double h;
    protected double volume;

    abstract void evaluateVolume();

    double getVolume(){
        return volume;
    }
}
