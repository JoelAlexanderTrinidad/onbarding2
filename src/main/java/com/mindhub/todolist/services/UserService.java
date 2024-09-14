package com.mindhub.todolist.services;

import com.mindhub.todolist.dtos.UserDTO;
import com.mindhub.todolist.models.User;

import java.util.List;

public interface UserService {

    List<UserDTO> findAll();

    List<User> findAllUser();

    UserDTO findById(Long id);

}
