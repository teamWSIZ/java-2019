package com.example.simplehtml;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SimpleController {
    int tab[][] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

    @RequestMapping("/")
    String getInfo() {
        return "info";
    }

    // name?name=przemyslaw&surname=stoklosa
    @RequestMapping("name")
    String getName(@RequestParam(value = "name", defaultValue = "Przemysław") String n,
                   @RequestParam(value = "surname", required = false) String s) {

        if (s == null)
            return "Nazwisko nie zostało wprowadzone";

        return n + " " + s;
    }

    // number/12?j=10
    @RequestMapping("number/{i}")
    String getNumber(@PathVariable("i") Integer i,
                     @RequestParam(value = "j", defaultValue = "1.0") Double j) {
        return i + "*" + j + "=" + i * j;
    }

    @RequestMapping("tab")
    int[][] getTab() {
        return tab;
    }

    // tab/2/2
    @RequestMapping("tab/{i}/{j}")
    String getTabNo(@PathVariable("i") Integer i, @PathVariable("j") Integer j) {
        String tabNoInfo = "";
        try{
            tabNoInfo =  "tab[" + i + "][" + j + "]=" + tab[i][j];
        }catch(ArrayIndexOutOfBoundsException e){
            tabNoInfo = "Nieprawidłowy indeks";
        }

        return tabNoInfo;
    }

    @RequestMapping("studentinfo")
    Student getStudent(){
        return new Student("Przemysław","Stokłosa");
    }

    @RequestMapping("studenci")
    ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        for(int i=0;i<10;i++)
            students.add(new Student("Przemysław","Stokłosa_"+i));

        return students;
    }
}
