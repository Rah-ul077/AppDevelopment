package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoService;
import com.example.demo.Student;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController 
{ 
    // public DemoService Demo;
    // DemoController(DemoService demo)
    // {
    //     this.Demo=demo;
    // }

    @GetMapping("/species")

    //@PathVariable("url")5 String url, @RequestParam("roll") String c
    public String getMethodName(@RequestParam("name") String b) 
    {
        return "good"+b;
    }
    
}


