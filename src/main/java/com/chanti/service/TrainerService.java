package com.chanti.service;

import java.util.List;

import com.chanti.model.Trainer;
import java.util.Optional;

public interface TrainerService 
{
	Trainer saveTrainer(Trainer entity);
	List<Trainer> showAllTrainers();
	Optional<Trainer> showTrainerByEmailId(String emailid);
}
