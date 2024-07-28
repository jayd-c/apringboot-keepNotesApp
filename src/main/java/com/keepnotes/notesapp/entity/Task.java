package com.keepnotes.notesapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String assignedTo;

    private String createdAt;
    private String desc;
    private String priority;
    private String status;
    private String title;

    public Task(String assignedTo, String createdAt, String desc, String priority, String status, String title) {
        this.assignedTo = assignedTo;
        this.createdAt = createdAt;
        this.desc = desc;
        this.priority = priority;
        this.status = status;
        this.title = title;
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
}