package com.skander.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.skander.user.entities.Role;
import com.skander.user.entities.User;
import com.skander.user.service.UserService;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceApplication {
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
	/*@PostConstruct
	void init_users() {
		// Add roles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));
		// Add users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "skander", "123", true, null));
		userService.saveUser(new User(null, "issam", "123", true, null));
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("Skander", "USER");
		userService.addRoleToUser("Issam", "USER");
	}*/
	
	//01_05 Done 

	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

}
