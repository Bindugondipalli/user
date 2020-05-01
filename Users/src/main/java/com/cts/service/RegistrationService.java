package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Register;
import com.cts.repo.RegisterRepo;

@Service
public class RegistrationService {
	@Autowired
	private RegisterRepo repo;

	public Register addUser(Register user) {
		// TODO Auto-generated method stub
		return repo.save(user);
		
	}

	public Optional<Register> getUserByID(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
