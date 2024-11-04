package com.example.taskmanager.servicetest;

import com.example.taskmanager.dto.TaskDTO;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void testCreateTask() {
        TaskDTO taskDTO = new TaskDTO("New Task", "New Task Description", "PENDING");
        Task task = new Task("New Task", "New Task Description", "PENDING");
        
        when(taskRepository.save(any(Task.class))).thenReturn(task);
        
        Task createdTask = taskService.createTask(taskDTO);

        assertEquals("New Task", createdTask.getTitle());
        assertEquals("PENDING", createdTask.getStatus());
        verify(taskRepository, times(1)).save(any(Task.class));
    }
}

