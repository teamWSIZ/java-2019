package com.example.datah2;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentRepository extends PagingAndSortingRepository<Student,Integer> {
    List<Student> findStudentByName(String name);
    Page<Student> findAll();
}
