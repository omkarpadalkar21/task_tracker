package com.omkar.task_tracker.services.impl;

import com.omkar.task_tracker.domain.entities.TaskList;
import com.omkar.task_tracker.repositories.TaskListRepository;
import com.omkar.task_tracker.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
