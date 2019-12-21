package com.example.arrays;

import java.util.ArrayList;

public class Main {
    public static void wyswietl(double tablica[]){
        for(int i=0;i<tablica.length;i++)
            System.out.println("Element["+i+"]="+tablica[i]);
    }

    public static double sumaElementow(double zmienna[]){
        double suma = 0;

        for(int i=0;i<zmienna.length;i++){
            suma = suma + zmienna[i];
        }
        return suma;
    }

    public static double srednia(double tablica[]){
        double suma = 0;

        for(int i=0;i<tablica.length;i++){
            suma = suma + tablica[i];
        }

        return suma/tablica.length;
    }

    public static int elementyMniejszeOdsredniej(double tablica[], double srednia){
        int ilosc_elementow = 0;
        for(int i=0;i<tablica.length;i++){
            if(tablica[i]<srednia)
                ilosc_elementow++;
        }
        return ilosc_elementow;
    }

    public static void main(String[] args) {
	    double tablica[] = new double[5];

	    for(int i=0;i<tablica.length;i++)
	        tablica[i] = i;

	    wyswietl(tablica);

	    double suma = sumaElementow(tablica);
	    double srednia = srednia(tablica);

	    System.out.println("Suma elementów: "+suma);
	    System.out.println("Srednia: "+srednia);

	    ArrayList<Integer> tablica2 = new ArrayList<>();

	    for(int i=0;i<100;i++)
	        tablica2.add(i);

	    for(int i=0;i<100;i++){
	        tablica2.get(i);
        }

	    for(int element : tablica2){
        }

    }
}
