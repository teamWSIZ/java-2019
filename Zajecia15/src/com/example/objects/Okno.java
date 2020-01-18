package com.example.objects;

public class Okno {
    private Double lenght;
    private Double width;

    private Double area;

    private Okno(){
    }

    private Okno(Double length, Double width){
        this.lenght = lenght;
        this.width = width;

        this.area = lenght*width;
    }
}
