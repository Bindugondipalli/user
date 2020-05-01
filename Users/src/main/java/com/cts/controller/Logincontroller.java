package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Login;
import com.cts.entity.Register;
import com.cts.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping("/log")
public class Logincontroller {
	
	@Autowired
	LoginService ls;
	
	@RequestMapping("/")
	Iterable<Login> getAllUsers()
	{	
		return ls.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/lusers")
	void addUser(@RequestBody Login l) {
		ls.addUser(l);
	}
	
	
	@RequestMapping("/lusers/{id}")
	Optional<Login> getUserByID(@PathVariable int id) {
		return ls.getUserByID(id);
	}	
	
	

}
