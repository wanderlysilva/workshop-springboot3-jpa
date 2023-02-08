package com.wanderlyspring.aulaspring1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wanderlyspring.aulaspring1.entities.User;
import com.wanderlyspring.aulaspring1.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById (Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
