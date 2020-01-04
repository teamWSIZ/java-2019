package com.example.arrays;

public class Main {

	public static void wyswietl(double tab[]){
		for(int i=0;i<tab.length;i++)
			System.out.println("Element["+i+"]="+tab[i]);
	}

	public static void wyswietl1(String nazwa, double t[]){
		System.out.print(nazwa+" = [");
		for(int i=0;i<t.length;i++){
			if(i<t.length-1)
				System.out.print(t[i]+", ");
			else
				System.out.print(t[i]);
		}
		System.out.println("]");
	}

	public static void wylosuj(double tab[]){
		for(int i=0;i<tab.length;i++)
			tab[i] = (int)(Math.random()*100)%100;
	}

	public static void wpisz_kwadraty(double tab[]){
		for(int i=0;i<tab.length;i++)
			tab[i] = i*i;
	}

	public static double[] dodajElementy(double tab[], double elementy[]){
		int nowy_rozmiar = tab.length+elementy.length;

		double tablica[] = new double[nowy_rozmiar];

		for(int i=0;i<tab.length;i++)
			tablica[i] = tab[i];

		int j=0;

		for(int i=tab.length;i<nowy_rozmiar;i++) {
			tablica[i] = elementy[i-tab.length];
			j++;
		}

		return tablica;
	}

    public static void main(String[] args) {
	    double tablica[] = new double[10];
		double t1[] = new double[10];

	    wylosuj(tablica);
	    wyswietl(tablica);

	    wpisz_kwadraty(t1);
	    System.out.println("--------------T1--------------");
	    wyswietl(t1);

		wyswietl1("t1",t1);

		double t2[] = new double[10];
		double elementy[] = new double[5];

		wpisz_kwadraty(t2);
		wpisz_kwadraty(elementy);

		double nowa_tablica[] = dodajElementy(t2,elementy);

		wyswietl1("nowa_tablica=",nowa_tablica);
    }
}
