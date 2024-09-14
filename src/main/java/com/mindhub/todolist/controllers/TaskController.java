package com.mindhub.todolist.controllers;

import com.mindhub.todolist.dtos.CreateTask;
import com.mindhub.todolist.dtos.TaskDTO;
import com.mindhub.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskDTO> getAllTasks() {
        return taskService.findAllTasks();
    }

    @PostMapping
    public TaskDTO createTask(@RequestBody CreateTask createTask, @RequestParam Long userId) {
        return taskService.createTask(createTask, userId);
    }

}
