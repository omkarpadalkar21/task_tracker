package com.omkar.task_tracker.mappers;

import com.omkar.task_tracker.domain.dto.TaskListDto;
import com.omkar.task_tracker.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
