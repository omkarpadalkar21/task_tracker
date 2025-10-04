package com.omkar.task_tracker.domain.dto;

import com.omkar.task_tracker.domain.entities.TasKStatus;
import com.omkar.task_tracker.domain.entities.TaskPriority;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TasKStatus status
) {
}
