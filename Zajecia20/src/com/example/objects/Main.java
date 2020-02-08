package com.example.objects;

public class Main {

    @FunctionalInterface
    interface dzialania{
        // a->a
        // a->{ return a*a; }

        double dzialanie(double x);
    }

    public static void main(String[] args) {

    }

    public static void wyswietlDzialanie(String nazwa, double x, dzialania dz){
        System.out.println(nazwa+" : "+dz.dzialanie(x));
    }
}
