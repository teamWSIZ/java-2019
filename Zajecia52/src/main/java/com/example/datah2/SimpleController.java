package com.example.datah2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SimpleController {
    @Autowired
    StudentRepository repository;

    @RequestMapping("add")
    @ResponseBody
    String addStudent(@RequestParam(value = "name",defaultValue = "Przemysław") String name, @RequestParam(value = "surname", defaultValue = "Stokłosa") String surname){
        repository.save(new Student(name,surname));
        return "Dodano poprawnie";
    }

    @RequestMapping("")
    String listAllStudents(Model model){
        Iterable<Student> students = repository.findAll();
        model.addAttribute("students",students);
        return "listStudents";
    }
    @RequestMapping("findName")
    String listStudentsName(@RequestParam(value = "name", defaultValue = "Piotr") String name, Model model){
        List<Student> students = repository.findStudentByName(name);
        model.addAttribute("students",students);
        return "listStudents";
    }
    @RequestMapping("page/{no}")
    String listPagedStudents(@PathVariable("no") int no, Model model){
        Pageable pageable = PageRequest.of(no,10);
        Page<Student> students = repository.findAll(pageable);
        model.addAttribute("students",students);
        return "listStudents";
    }

}
