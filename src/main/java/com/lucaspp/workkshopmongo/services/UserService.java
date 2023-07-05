package com.lucaspp.workkshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaspp.workkshopmongo.entities.User;
import com.lucaspp.workkshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		
		return repository.findAll();
	}

}
