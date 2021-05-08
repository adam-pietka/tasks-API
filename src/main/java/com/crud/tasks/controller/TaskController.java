package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
@RequiredArgsConstructor
public class TaskController {
    private final DbService service;
    private final TaskMapper taskMapper;

    @GetMapping(value = "getTasks")
    public List<TaskDto> getTasks() {
        List<Task> tasks = service.getAllTasks();
//        return new ArrayList<>();
        return taskMapper.mapToTaskDtoList(tasks);
    }

    @GetMapping(value = "getTask")
    public TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "test_title", "test_content.");
    }

    @PutMapping(value = "updateTask")
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @DeleteMapping
    public void deleteTask(Long taskId) {
    }

    @PostMapping
    public void createTask(TaskDto taskDto) {

    }
}