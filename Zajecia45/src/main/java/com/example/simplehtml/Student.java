package com.example.simplehtml;

import lombok.Data;

@Data
public class Student {
    String name;
    String surname;

    Integer id;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
