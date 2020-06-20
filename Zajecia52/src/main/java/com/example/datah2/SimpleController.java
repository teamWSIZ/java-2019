package com.example.datah2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
