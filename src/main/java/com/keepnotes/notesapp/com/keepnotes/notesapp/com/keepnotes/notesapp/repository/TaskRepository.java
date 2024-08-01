package com.keepnotes.notesapp.com.keepnotes.notesapp.com.keepnotes.notesapp.repository;

import com.keepnotes.notesapp.com.keepnotes.notesapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//extends JPARepository Interface
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
