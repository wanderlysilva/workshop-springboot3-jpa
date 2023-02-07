package com.wanderlyspring.aulaspring1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wanderlyspring.aulaspring1.entities.User;
import com.wanderlyspring.aulaspring1.repositories.UserRepository;

public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
