package com.abhinav.jobListing.controller;

import com.abhinav.jobListing.PostRepository;
import com.abhinav.jobListing.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class JobPostController {

    @Autowired
    PostRepository repo;
@GetMapping("/posts")
    public List<Post> posts(){
return repo.findAll();
}

@PostMapping("/post")
public Post createPost(@RequestBody Post post){
    return repo.save(post);
}
}
