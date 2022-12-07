package com.skander.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skander.user.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);
}

