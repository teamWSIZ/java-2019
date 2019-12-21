package com.example.arrays;

public class Main {

    public static void main(String[] args) {
	    double tablica[] = new double[10];

	    for(int i=0;i<tablica.length;i++)
	        tablica[i] = i;

	    for(int i=0;i<tablica.length;i++)
	        System.out.println("Element["+i+"]="+tablica[i]);

    }
}
