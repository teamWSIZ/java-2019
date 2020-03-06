package com.example.objects;

public class Student {
    private String name;
    private String surname;

    private static int id = 1;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='"+Student.id + '\'' +
                '}';
    }
}
