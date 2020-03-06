package com.example.objects;

public class Student {
    private String name;
    private String surname;

    private int no;
    private static int id = 1;

    public static void printDatabaseSize(){
        System.out.println("Size:"+(id-1));
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

        no = id;
        id++;
    }

    private static void setId(int id){
        Student.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='"+Student.id + '\'' +
                ", no='"+no + '\'' +
                '}';
    }
}
