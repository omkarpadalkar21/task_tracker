package com.omkar.task_tracker.services.impl;
import com.omkar.task_tracker.domain.entities.Task;
import com.omkar.task_tracker.repositories.TaskRepository;
import com.omkar.task_tracker.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImp implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listTask(UUID taskListId) {
        return taskRepository.findByTaskListId(taskListId);
    }
}
