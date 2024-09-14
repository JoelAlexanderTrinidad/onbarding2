package com.mindhub.todolist.dtos;

import com.mindhub.todolist.models.Task;

public class TaskDTO {

    private Long id;

    private String descripcion;

    private Boolean completada;

    public TaskDTO() {
    }

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.descripcion = task.getDescripcion();
        this.completada = task.getCompletada();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public Long getId() {
        return id;
    }
}
