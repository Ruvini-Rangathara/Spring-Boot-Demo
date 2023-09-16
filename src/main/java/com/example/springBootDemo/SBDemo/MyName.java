package com.example.springBootDemo.SBDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MyName {

    @GetMapping
    String getMyName(){
        return "Ruvini";
    }
}
