package com.example.simplehtml;

import lombok.Data;

@Data
public class Student {
    String name;
    String surname;

    static Integer id = 0;

    Student(String name, String surname){
        id++;
        this.name = name;
        this.surname = surname+"_"+id;
    }
}
