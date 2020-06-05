package com.example.simplehtml;

public class Student {
    String name;
    String surname;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
