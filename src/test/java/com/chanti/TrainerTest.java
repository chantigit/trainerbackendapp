package com.chanti;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.chanti.model.Trainer;
import com.chanti.repo.TrainerRepo;

@DataJpaTest
public class TrainerTest {

	@Autowired
	TrainerRepo trainerRepo;

	@Test
	@Rollback(false)
	public void saveTest() {

		Trainer trainer = new Trainer("raju", "r@gmail.com", 22, "java");
		Trainer trainerData = trainerRepo.save(trainer);
		Trainer trainer2 = new Trainer("uday", "u@gmail.com", 25, "java");
		Trainer trainerData2 = trainerRepo.save(trainer2);
		Trainer trainer3 = new Trainer("hari", "h@gmail.com", 56, "java");
		Trainer trainerData3 = trainerRepo.save(trainer3);
		assertNotNull(trainerData);

	}
	
	@Test
	public void updateTrainerTest() {

	//	Optional<Trainer> findById2 = trainerRepo.findById(1);

		Trainer trainer2 = new Trainer(1,"james", "j@gmail.com", 20, "java");
	     //trainer2.setId(1);
		Trainer trainerData = 	trainerRepo.save(trainer2);
		System.out.println("trainerData=="+trainerData);
		Optional<Trainer> trainer3 = trainerRepo.findById(1);
		System.out.println("update trainer3=="+trainer3);
		
		assertThat(trainer3.get().getEmail()).isEqualTo(trainer2.getEmail());

	}

	@Test
	public void getListTest() {

		List<Trainer> trainersList = trainerRepo.findAll();
		// trainersList=null;
		System.out.println(trainersList);
		assertThat(trainersList).size().isGreaterThan(0);

	}

	/*	@Test
	public void deleteTest() {
		Integer id = 1;
		boolean status = trainerRepo.findById(1).isPresent();
		trainerRepo.deleteById(id);
		assertTrue(status);
		assertFalse(status);
	}*/

}
