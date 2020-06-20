package com.example.datah2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    @RequestMapping("add")
    @ResponseBody
    String addStudent(){
        return "Dodano poprawnie";
    }

    @RequestMapping("")
    String listAllStudents(){
        return "listStudents";
    }
}
