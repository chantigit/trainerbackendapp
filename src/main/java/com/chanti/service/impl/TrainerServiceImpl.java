package com.chanti.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chanti.model.Trainer;
import com.chanti.repo.TrainerRepo;
import com.chanti.service.TrainerService;
@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	private TrainerRepo repo;
	
	@Override
	@Transactional
	public Trainer saveTrainer(Trainer entity) {
		return repo.save(entity);
	}

	@Override
	public List<Trainer> showAllTrainers() {
		return repo.findAll();
	}

	@Override
	public Optional<Trainer> showTrainerByEmailId(String emailid) {
		return repo.findByEmail(emailid);
	}

}
