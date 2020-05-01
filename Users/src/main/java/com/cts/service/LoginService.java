package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Login;
import com.cts.repo.LoginRepo;



@Service
public class LoginService {
	
	@Autowired
	private LoginRepo repo;

	public Iterable<Login> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();

	}

	public Login addUser(Login l) {
		// TODO Auto-generated method stub
		return repo.save(l);
		
	}

	public Optional<Login> getUserByID(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	

}
