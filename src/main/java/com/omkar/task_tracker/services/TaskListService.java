package com.omkar.task_tracker.services;

import com.omkar.task_tracker.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> listTaskLists();

    TaskList createTaskList(TaskList taskList);

    Optional<TaskList> getTaskList(UUID id);

    TaskList updateTaskList(UUID taskListId, TaskList taskList);

    void deleteTaskList(UUID taskListId);
}
