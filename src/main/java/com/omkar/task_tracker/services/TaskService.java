package com.omkar.task_tracker.services;

import com.omkar.task_tracker.domain.entities.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    List<Task> listTask(UUID taskListId);
}
