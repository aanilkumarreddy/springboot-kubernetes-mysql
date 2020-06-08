package com.mindtree.kubernetes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kubernetes.Users;

import com.mindtree.kubernetes.UserService;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

	@Autowired
	UserService userService;
	
	@GetMapping(value = "/get")
	public String getAllEmployees() {
		return "Welcome";

	}


	@GetMapping("/getAllUsers")
	public List<Users> listUsers() {
		return userService.findAllUsers();
	}

	@PostMapping("/addUser")
	public String createUser(@RequestBody Users uDto) {

		return userService.addUser(uDto);

	}
}
