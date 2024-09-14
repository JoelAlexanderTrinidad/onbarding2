package com.mindhub.todolist.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CuteController {

    @GetMapping
    public String getMsg(){
        return "Hola como va, este es el onboarding 1 :D";
    }

    @PostMapping
    public String createMsg(@RequestBody String msg){
        return "Mensajito: " + msg;
    }
}
