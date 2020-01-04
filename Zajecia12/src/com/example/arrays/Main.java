package com.example.arrays;

import java.util.ArrayList;

class Student {
    String imie;
    String nazwisko;
    int nr_indeksu;
    int wiek;

    Student(String imie, String nazwisko, int nr_indeksu, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.wiek = wiek;
    }

    void wyswietl() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer indeksu" + nr_indeksu);
        System.out.println("Wiek: " + wiek);
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> tablica = new ArrayList<>();

        Student adrian = new Student("Adrian","Adamek",2343,20);

        adrian.imie = "Adrian";
        adrian.nazwisko = "Adamek";
        adrian.nr_indeksu = 2343;
        adrian.wiek = 20;

        adrian.wyswietl();

    }
}
