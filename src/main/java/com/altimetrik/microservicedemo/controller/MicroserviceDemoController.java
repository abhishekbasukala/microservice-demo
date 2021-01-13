package com.altimetrik.microservicedemo.controller;

import com.altimetrik.microservicedemo.service.MicroserviceDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceDemoController {

    @Autowired
    private MicroserviceDemoService service;

    @GetMapping("/microserivce/demo/{id}")
    public String getPartDetail(@PathVariable Long id){
        return service.printPart(id);
    }

}
