package com.example.objects;

public class Komputer {
    private String name;
    private Double power;

    private Komputer(){
    }

    public Komputer(String name, Double power){
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public Double getPower() {
        return power;
    }
}
