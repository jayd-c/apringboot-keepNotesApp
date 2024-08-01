package com.keepnotes.notesapp.com.keepnotes.notesapp;

import com.keepnotes.notesapp.com.keepnotes.notesapp.com.keepnotes.notesapp.repository.TaskRepository;
import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class TaskConfig {
    @Bean
    CommandLineRunner commandLineRunner (TaskRepository repository) {
//        return args -> {
//            Task one = new Task("ajayan","12.02.2024","bla bla","high","new","test 1");
//            Task two = new Task("palayan","12.02.2024","bla bla","high","new","test 2");
//            repository.saveAll(List.of(one,two));
//        };
        return null;
    }
}
