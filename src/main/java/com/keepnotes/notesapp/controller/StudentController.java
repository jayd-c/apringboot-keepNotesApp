package com.keepnotes.notesapp.controller;

import com.keepnotes.notesapp.com.keepnotes.notesapp.repository.Repository;
import com.keepnotes.notesapp.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    Repository studentRepo;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> allTasks =  studentRepo.findAll();
    }
}
