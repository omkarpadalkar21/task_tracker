package com.omkar.task_tracker.controllers;

import com.omkar.task_tracker.domain.dto.TaskDto;
import com.omkar.task_tracker.mappers.TaskMapper;
import com.omkar.task_tracker.services.TaskListService;
import com.omkar.task_tracker.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/task-lists/{task_list_id}/tasks")
public class TasksController {
    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TasksController(TaskService taskService, TaskMapper taskMapper, TaskListService taskListService) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @GetMapping
    public List<TaskDto> listTasks(@PathVariable("task_list_id") UUID taskListId) {
        return taskService.listTask(taskListId).stream().map(taskMapper::toDto).toList();
    }
}
