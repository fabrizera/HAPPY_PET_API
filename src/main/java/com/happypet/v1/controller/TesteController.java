package com.happypet.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/teste")
public class TesteController {

    @GetMapping
    public String teste(){
        return "teste";
    }

}
