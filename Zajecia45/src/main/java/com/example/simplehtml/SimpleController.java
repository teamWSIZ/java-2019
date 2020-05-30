package com.example.simplehtml;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
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
}
