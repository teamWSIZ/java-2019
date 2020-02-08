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


        System.out.println("Wynik: "+d0.dzialanie(10));


    }

    public static void wyswietlDzialanie(String nazwa, double x, dzialania dz) {
        System.out.println(nazwa + " : " + dz.dzialanie(x));
    }

    public static void wyswietlDzialanie(String nazwa, double x, kolejneDzialanie dz) {
        System.out.println(nazwa + " : " + dz.funkcja(x, x, x, x));
    }
}
