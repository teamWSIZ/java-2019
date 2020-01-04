package com.example.arrays;

import java.util.ArrayList;

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

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> baza_studentow = new ArrayList<>();

        Student adrian = new Student("Adrian","Adamek",2343,20);
        Student ewa = new Student("Ewa","Kowalska",2345,19);

        baza_studentow.add(adrian);
        baza_studentow.add(ewa);

        adrian.wyswietl();
        ewa.wyswietl();

        adrian.ZmienNumerIndeksu(200);

        for(Student student : baza_studentow)
            student.wyswietl();


    }
}
