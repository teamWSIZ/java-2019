package com.example.objects;

import java.util.ArrayList;
import java.util.Arrays;

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

    @FunctionalInterface
    interface wyswietlCos{
        void wyswietlDzialanie(double x);
    }

    @FunctionalInterface
    interface dzialanieNaTablicy{
        double f_tab(ArrayList<Integer> array);
    }

    public static void main(String[] args) {
        wyswietlDzialanie("Kwadrat", 10, x -> x * x);

        wyswietlDzialanie("Sześcian", 10, x -> {
            System.out.println("....obliczam....");
            return x * x * x;
        });

        wyswietlDzialanie("dodaj elementy", 10, (a, b, c, d) -> a + b + c + d);

        dzialania d0 = t->t*t;
        dzialania d1 = (t)->t*t;
        dzialania d2 = t->10;
        dzialania d3 = t->{return 10;};
        dzialania d4 = t->{
            System.out.println("Funkcja...");
            return t*t;
        };

        kolejneDzialanie d10 = (a,b,c,d)->a+b+c+d;

        wyswietlCos d20 = x->System.out.println(x);

        dzialanieNaTablicy dzialanieT = x->{
            double suma = 0;
            for(double number : x)
                suma+=number;
            return suma;
        };

        ArrayList<Integer> tablica = new ArrayList(Arrays.asList(1,2,3,4,5));

        System.out.println("Wynik: "+d0.dzialanie(10));
        System.out.println(dzialanieT.f_tab(tablica));

    }

    public static void wyswietlDzialanie(String nazwa, double x, dzialania dz) {
        System.out.println(nazwa + " : " + dz.dzialanie(x));
    }

    public static void wyswietlDzialanie(String nazwa, double x, kolejneDzialanie dz) {
        System.out.println(nazwa + " : " + dz.funkcja(x, x, x, x));
    }
}
