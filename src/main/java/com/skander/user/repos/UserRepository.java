package com.skander.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skander.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
