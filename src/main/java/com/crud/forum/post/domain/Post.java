package com.crud.forum.post.domain;

import lombok.Getter;

public class Post {

    @Getter
    private Long postId;
    private Long userId;
    private String postContent;

}
