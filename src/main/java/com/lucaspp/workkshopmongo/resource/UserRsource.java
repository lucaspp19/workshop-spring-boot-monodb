package com.lucaspp.workkshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lucaspp.workkshopmongo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserRsource {
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		
		User maria = new User(1l, "maria", "maria@gmail.com");
		User lucas = new User(2l, "lucas", "lucas@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, lucas));
		
		return ResponseEntity.ok().body(list);
		
	}
	

}
