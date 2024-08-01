package com.keepnotes.notesapp.com.keepnotes.notesapp.controller;

import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import com.keepnotes.notesapp.com.keepnotes.notesapp.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
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

    @PostMapping
    public void createNewTask(@RequestBody Task task) {
        taskService.addNewTask(task);
    }


}
