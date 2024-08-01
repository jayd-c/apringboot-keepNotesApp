package com.keepnotes.notesapp.com.keepnotes.notesapp.service;

import com.keepnotes.notesapp.com.keepnotes.notesapp.com.keepnotes.notesapp.repository.TaskRepository;
import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks () {
      return taskRepository.findAll();
    }

    public void addNewTask(Task task) {
        taskRepository.save(task);
    }
}
