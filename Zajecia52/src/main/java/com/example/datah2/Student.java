package com.example.datah2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    String name;
    String surname;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
