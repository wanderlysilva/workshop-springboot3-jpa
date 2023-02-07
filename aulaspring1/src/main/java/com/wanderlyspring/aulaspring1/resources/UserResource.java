package com.wanderlyspring.aulaspring1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanderlyspring.aulaspring1.entities.User;
import com.wanderlyspring.aulaspring1.services.UserService;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<User> findAll(){	
	
		List<User> list = 
	}
}
