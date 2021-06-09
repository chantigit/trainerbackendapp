package com.chanti.repo;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chanti.model.Trainer;
@Repository
public interface TrainerRepo extends JpaRepository<Trainer, Serializable> {

	Optional<Trainer> findByEmail(String emailid);
	
}
