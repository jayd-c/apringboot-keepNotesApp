package com.keepnotes.notesapp.com.keepnotes.notesapp.controller;

import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import com.keepnotes.notesapp.com.keepnotes.notesapp.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("tasks")
    public List<Task> getTasks () {
      return taskService.getTasks();
    }



}
