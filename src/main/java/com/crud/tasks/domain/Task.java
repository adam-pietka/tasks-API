package com.crud.tasks.domain;

import lombok.Getter;

public class Task {
    @Getter
    private Long id;
    private String title;
    private String content;
}
