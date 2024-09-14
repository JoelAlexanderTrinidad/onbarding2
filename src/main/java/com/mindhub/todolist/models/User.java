package com.mindhub.todolist.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "\"user\"") // tuve que agregar esto porque me tiraba un error al buildear Syntax error in SQL statement "alter table if exists task add constraint FK2hsytmxysatfvt0p1992cw449 foreign key (user_id) references [*]user"; expected "identifier"; SQL statement
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Task> tasks = new HashSet<>();

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTask(Task task){
        task.setUser(this);
        tasks.add(task);
    }
}
