package com.wanderlyspring.aulaspring1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanderlyspring.aulaspring1.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){	
	User u = new User (1L, "Wanderly","wanderly@gmail.com","9999999","12345");
	return ResponseEntity.ok().body(u);
	}
}