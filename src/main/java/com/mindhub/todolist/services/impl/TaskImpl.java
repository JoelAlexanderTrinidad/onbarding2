package com.mindhub.todolist.services.impl;

import com.mindhub.todolist.dtos.CreateTask;
import com.mindhub.todolist.dtos.TaskDTO;
import com.mindhub.todolist.models.Task;
import com.mindhub.todolist.models.User;
import com.mindhub.todolist.repositories.TaskRepository;
import com.mindhub.todolist.repositories.UserRepository;
import com.mindhub.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<TaskDTO> findAllTasks() {
        return findAll().stream().map(TaskDTO::new).toList();
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public TaskDTO createTask(CreateTask createTask, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Task task = new Task(createTask.getDescripcion(), createTask.getCompletada());
        user.addTask(task);
        userRepository.save(user);

        return new TaskDTO(task);
    }
}
