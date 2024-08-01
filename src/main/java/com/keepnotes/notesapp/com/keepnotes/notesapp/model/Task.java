package com.keepnotes.notesapp.com.keepnotes.notesapp.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "task")
public class Task {
    @Id
    private String taskCode;
    private String assignedTo;
    private String createdAt;
    private String description;
    private String priority;
    private String status;
    private String title;

    public Task() {
    }

    public Task(String taskCode, String assignedTo, String createdAt, String description, String priority, String status, String title) {
        this.taskCode = taskCode;
        this.assignedTo = assignedTo;
        this.createdAt = createdAt;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.title = title;
    }

    public Task(String assignedTo, String createdAt, String description, String priority, String status, String title) {
        this.assignedTo = assignedTo;
        this.createdAt = createdAt;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.title = title;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
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
                "id=" + taskCode +
                ", assignedTo='" + assignedTo + '\'' +
                ", createdAt=" + createdAt +
                ", desc='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
