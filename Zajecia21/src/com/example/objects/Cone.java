package com.example.objects;

public class Cone extends Figure3D implements Material{

    double unitPrice;

    Cone(double r, double h){
        this.h = h;
        bottom = new Bottom(Math.PI*r*r);

        evaluateVolume();
    }

    @Override
    void evaluateVolume() {
        volume = 1.0/3.0*bottom.getField()*h;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getPrice() {
        return unitPrice*volume;
    }

    @Override
    public void printPrice() {
        System.out.println("Price: "+getPrice());
    }
}
