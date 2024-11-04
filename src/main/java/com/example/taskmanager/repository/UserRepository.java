package com.example.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskmanager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // Custom query to find user by username
    User findByUsername(String username);
}
