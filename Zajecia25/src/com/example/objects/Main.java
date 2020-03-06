package com.example.objects;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> student = new ArrayList<>();

        Student przemyslaw = new Student("Przemysław", "Stokłosa");
        student.add(przemyslaw);

        student.add(new Student("Jan", "Kowalski"));
        student.add(new Student("Przemysław", "Stokłosa"));
        student.add(new Student("Jan", "Kowalski"));


        printStudents(student);

        Student.printDatabaseSize();
    }

    static void printStudents(ArrayList<Student> students) {
        students.forEach(student -> {
            System.out.println(student.toString());
        });
    }
}
