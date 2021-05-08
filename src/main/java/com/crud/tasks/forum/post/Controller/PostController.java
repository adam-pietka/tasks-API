package com.crud.tasks.forum.post.Controller;

import com.crud.tasks.forum.post.domain.PostDao;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ver1/post")
public class PostController {

    @GetMapping(value = "getPosts")
    public List<PostDao> getPosts(){return new ArrayList<>();}

    @GetMapping(value = "getPost")
    public PostDao getPost(Long postId){
        return new PostDao(1L, 11001L, "It's first post on virtual forum. XYZ");
    }

    @PutMapping(value = "updatePost")
    public PostDao updatePost(Long postId){
        return new PostDao(2L, 1002L,"Edite Post on virtual forum.");
    }

    @DeleteMapping
    public void deletePost(Long postId){
    }

    @PostMapping
    public void createPost(PostDao postDao){
    }


}
