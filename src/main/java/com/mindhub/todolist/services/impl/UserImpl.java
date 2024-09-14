package com.mindhub.todolist.services.impl;

import com.mindhub.todolist.dtos.TaskDTO;
import com.mindhub.todolist.dtos.UserDTO;
import com.mindhub.todolist.models.User;
import com.mindhub.todolist.repositories.UserRepository;
import com.mindhub.todolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
        return findAllUser().stream().map(UserDTO::new).toList();
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        return new UserDTO(user);
    }

}
