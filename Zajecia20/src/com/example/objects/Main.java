package com.example.objects;

public class Main {

    @FunctionalInterface
    interface dzialania {
        // a->a
        // a->{ return a*a; }

        double dzialanie(double x);
    }

    @FunctionalInterface
    interface kolejneDzialanie {
        //funkcja pobierajaca cztery parametry

        double funkcja(double a, double b, double c, double d);
    }

    public static void main(String[] args) {
        wyswietlDzialanie("Kwadrat", 10, x -> x * x);

        wyswietlDzialanie("Sześcian", 10, x -> {
            System.out.println("....obliczam....");
            return x * x * x;
        });


    }

    public static void wyswietlDzialanie(String nazwa, double x, dzialania dz) {
        System.out.println(nazwa + " : " + dz.dzialanie(x));
    }
}
