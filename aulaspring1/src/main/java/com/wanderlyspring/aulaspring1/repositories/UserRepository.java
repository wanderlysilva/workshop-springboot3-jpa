package com.wanderlyspring.aulaspring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderlyspring.aulaspring1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
