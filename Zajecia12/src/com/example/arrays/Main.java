package com.example.arrays;

import java.util.ArrayList;

class Student{
    String imie;
    String nazwisko;
    int nr_indeksu;
    int wiek;

    void wyswietl(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Numer indeksu"+nr_indeksu);
        System.out.println("Wiek: "+wiek);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> tablica = new ArrayList<>();

        Student adrian = new Student();
        adrian.imie = "Adrian";
        adrian.nazwisko = "Adamek";
        adrian.nr_indeksu = 2343;
        adrian.wiek = 20;

    }
}
