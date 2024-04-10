package com.utadeo.taskapp.taskapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/{name}")
    public String HelloWorld(@PathVariable("name") String name){
        return "hola mundo " +name;
    }

    @GetMapping("hello/years/{years}")
    public String GetYears(@PathVariable("years") String years){
        return "tengo " +years+ "años";
    }
    
    
}
