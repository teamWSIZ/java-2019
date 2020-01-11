package com.example.arrays;

class Student {
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    private int wiek;

    Student(String imie, String nazwisko, int nr_indeksu, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.wiek = wiek;
    }

    void wyswietl() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer indeksu: " + nr_indeksu);
        System.out.println("Wiek: " + wiek);
    }

    public void ZmienNumerIndeksu(int nr_indeksu){
        this.nr_indeksu = nr_indeksu;
    }
}
