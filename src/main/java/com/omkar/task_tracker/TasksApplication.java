package com.omkar.task_tracker;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        // Ensure the JVM uses a Postgres-recognised timezone id.
        // Some JDK installations or OS locales may expose the legacy id
        // "Asia/Calcutta" which Postgres rejects; use "Asia/Kolkata".
        TimeZone defaultTz = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone.setDefault(defaultTz);
        System.setProperty("user.timezone", "Asia/Kolkata");

        SpringApplication.run(TasksApplication.class, args);
    }

}
