package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Register;
import com.cts.service.RegistrationService;


@RestController
@CrossOrigin

public class RegisterController {
	@Autowired
	RegistrationService rs;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody Register user) {
		rs.addUser(user);
	}
	
	
	@RequestMapping("/users/{id}")
	Optional<Register> getUserByID(@PathVariable int id) {
		return rs.getUserByID(id);
	}	
		

}
