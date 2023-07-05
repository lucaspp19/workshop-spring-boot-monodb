package com.lucaspp.workkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucaspp.workkshopmongo.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
