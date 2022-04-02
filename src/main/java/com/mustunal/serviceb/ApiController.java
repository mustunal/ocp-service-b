package com.mustunal.serviceb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {


    @GetMapping
    public String sayHello(){
        for(int i=0; i < 1000; i++){
            for(int y=0; y < 10; i++){
                    String name = "Murat";
                    String surname = "ÜSTÜNAL";
                    String nameSurname = name + " " + surname;
            }
        }
        return "Hello World From Service-B -naming- v4";
    }
}
