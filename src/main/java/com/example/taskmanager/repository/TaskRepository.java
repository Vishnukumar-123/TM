package com.example.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
