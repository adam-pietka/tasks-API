package com.crud.forum.post.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostDao {
    private Long postId;
    private Long userId;
    private String postContent;
}
