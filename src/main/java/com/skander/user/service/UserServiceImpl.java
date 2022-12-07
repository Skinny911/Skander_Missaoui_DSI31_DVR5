package com.skander.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skander.user.entities.Role;
import com.skander.user.entities.User;
import com.skander.user.repos.RoleRepository;
import com.skander.user.repos.UserRepository;

import javax.transaction.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder BCryptPasswordEncoder;

	@Override
	public User saveUser(User user) {
		
		user.setPassword(BCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public User findUserByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

	@Override
	public Role addRole(Role role) {
	
		return roleRepository.save(role);
	}

	@Override
	public User addRoleToUser(String username, String rolename) {
		
		User user = userRepository.findByUsername(username);
		Role role = roleRepository.findByRole(rolename);
		
		user.getRoles().add(role);
		//userRepository.save(user);
		
		return user;
	}

}
