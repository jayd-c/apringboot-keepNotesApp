package com.keepnotes.notesapp.com.keepnotes.notesapp.service;

import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    public List<Task> getTasks () {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Jayan", LocalDate.of(2024, Month.JULY,5),"loremipsum20","high","pending","Do it now"));
        taskList.add(new Task("Payan", LocalDate.of(2021, Month.JULY,5),"akldaasdk","high","done","Do it or die"));
        return taskList;
    }
}
