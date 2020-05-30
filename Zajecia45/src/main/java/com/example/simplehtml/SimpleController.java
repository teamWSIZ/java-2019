package com.example.simplehtml;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    String getInfo(){
        return "info";
    }
    // name?name=przemyslaw&surname=stoklosa
    @RequestMapping("name")
    String getName(@RequestParam(value = "name", defaultValue="Przemysław") String n,
                   @RequestParam(value = "surname", required = false) String s){

        if(s==null)
            return "Nazwisko nie zostało wprowadzone";

        return n+" "+s;
    }

    @RequestMapping("number/{i}")
    Double getNumber(){
        return 0.0;
    }
}
