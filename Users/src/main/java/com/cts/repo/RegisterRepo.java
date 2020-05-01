package com.cts.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Register;

@Repository
public interface RegisterRepo extends CrudRepository<Register, Integer> {

	Optional<Register> findById(Integer userId);
}
