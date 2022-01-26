package com.preetysta.corsConfigTutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayName {

    @GetMapping("/hello")
    public String display(){
        return "Hello";
    }
}
