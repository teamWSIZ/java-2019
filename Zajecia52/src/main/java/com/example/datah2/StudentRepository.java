package com.example.datah2;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findStudentByName(String name);
}
