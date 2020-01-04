package com.example.arrays;

public class Main {

	public static void wyswietl(double tab[]){
		for(int i=0;i<tab.length;i++)
			System.out.println("Element["+i+"]="+tab[i]);
	}

	public static void wylosuj(double tab[]){
		for(int i=0;i<tab.length;i++)
			tab[i] = (int)(Math.random()*100)%100;
	}

	public static void wpisz_kwadraty(double tab[]){
		tab[4] = 4*4;
	}

    public static void main(String[] args) {
	    double tablica[] = new double[100];
		double t1[] = new double[10];

	    wylosuj(tablica);
	    wyswietl(tablica);

	    System.out.println("--------------T1--------------");
	    wyswietl(t1);
    }
}
