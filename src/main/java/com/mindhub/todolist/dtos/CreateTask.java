package com.mindhub.todolist.dtos;

public class CreateTask {

    private String descripcion;
    private Boolean completada;

    public CreateTask(String descripcion, Boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }
}
