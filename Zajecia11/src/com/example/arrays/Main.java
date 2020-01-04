package com.example.arrays;

public class Main {

	public static void wyswietl(double tab[]){
		for(int i=0;i<tab.length;i++)
			System.out.println("Element["+i+"]="+tab[i]);
	}

    public static void main(String[] args) {
	    double tablica[] = new double[100];

	    for(int i=0;i<tablica.length;i++)
	    	tablica[i] = Math.random()*100;

	    System.out.println("Element[0]="+tablica[0]);

    }
}
