package com.mindhub.todolist;

import com.mindhub.todolist.models.Task;
import com.mindhub.todolist.models.User;
import com.mindhub.todolist.repositories.TaskRepository;
import com.mindhub.todolist.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(UserRepository userRepository, TaskRepository taskRepository){
		return args -> {

			Task task = new Task("No llegué con el crud :c", false);
			User user = new User("Jordi ENP (Jordi el niño programador)");
			user.addTask(task);

			userRepository.save(user);
			taskRepository.save(task);

		};
	}
}
