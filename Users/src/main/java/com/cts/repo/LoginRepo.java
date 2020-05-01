package com.cts.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Login;



@Repository
public interface LoginRepo extends CrudRepository<Login, Integer> {
		Login findByUserName(String userName, String password);

		Iterable<Login> findAll();

		Optional<Login> findById(Integer id);
		
	

}
