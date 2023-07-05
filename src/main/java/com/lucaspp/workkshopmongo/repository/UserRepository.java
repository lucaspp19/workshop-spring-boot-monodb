package com.lucaspp.workkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucaspp.workkshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
