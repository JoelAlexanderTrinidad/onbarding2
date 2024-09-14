package com.mindhub.todolist.services;

import com.mindhub.todolist.dtos.CreateTask;
import com.mindhub.todolist.dtos.TaskDTO;
import com.mindhub.todolist.models.Task;

import java.util.List;

public interface TaskService {

    List<TaskDTO> findAllTasks();

    List<Task> findAll();

    TaskDTO createTask(CreateTask createTask, Long userId);
}
