package com.keepnotes.notesapp.com.keepnotes.notesapp.model;

import jakarta.persistence.*;

import java.time.LocalDate;
//this @Entity for hibernate
@Entity
//@Table to create a table in database (@Table(name="your name" if you want to change the default name)
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String assignedTo;
    private LocalDate createdAt;
    private String desc;
    private String priority;
    private String status;
    private String title;

    public Task(String assignedTo, LocalDate createdAt, String desc, String priority, String status, String title) {
        this.assignedTo = assignedTo;
        this.createdAt = createdAt;
        this.desc = desc;
        this.priority = priority;
        this.status = status;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", assignedTo='" + assignedTo + '\'' +
                ", createdAt=" + createdAt +
                ", desc='" + desc + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
