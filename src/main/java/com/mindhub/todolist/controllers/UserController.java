package com.mindhub.todolist.controllers;

import com.mindhub.todolist.dtos.UserDTO;
import com.mindhub.todolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    private List<UserDTO> getAllUser(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    private UserDTO getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

}
