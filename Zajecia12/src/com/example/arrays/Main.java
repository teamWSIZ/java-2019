package com.example.arrays;

import java.util.ArrayList;

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
