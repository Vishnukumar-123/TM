package com.example.taskmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    public User(String username1, String encodedPassword, String email1) {
    }

    @Id
    private String username;
    private String password;
    private String email;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}