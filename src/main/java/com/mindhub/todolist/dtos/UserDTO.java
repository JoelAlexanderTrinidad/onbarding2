package com.mindhub.todolist.dtos;

import com.mindhub.todolist.models.Task;
import com.mindhub.todolist.models.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserDTO {

    private Long id;

    private Set<TaskDTO> tasks;

    private String name;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.tasks = user.getTasks().stream().map(TaskDTO::new).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    public Set<TaskDTO> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
