package com.example.objects;

public class Main {

    @FunctionalInterface
    interface dzialania{
        // a->a
        // a->{ return a*a; }

        double dzialanie(double x);
    }

    public static void main(String[] args) {
	// write your code here
    }

    public static void wyswietlDzialanie(double x, dzialania dz){
        System.out.println("Wynik działania:"+dz.dzialanie(x));
    }
}
