package com.abhinav.jobListing;

import com.abhinav.jobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,Integer> {


}
