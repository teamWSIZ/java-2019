package com.example.objects;

public class Student {
    private String name;
    private String surname;

    private Integer id;

    private Student(){
    }

    public Student(String name, String surname, Integer id){
        this.name = name;
        this.surname = surname;

        this.id = id;
    }
}
