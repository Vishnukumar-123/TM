package com.example.taskmanager.dto;

public class TaskDTO {
    public String title;
    public String description;
    public String status;

    public TaskDTO(String title, String description, String status){
        this.title = title;
        this.description = description;
        this.status = status;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
