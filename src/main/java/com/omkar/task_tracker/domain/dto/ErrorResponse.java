package com.omkar.task_tracker.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}
