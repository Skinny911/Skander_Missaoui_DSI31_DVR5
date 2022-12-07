package com.skander.user.service;

import com.skander.user.entities.Role;
import com.skander.user.entities.User;

public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
