package com.chanti.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chanti.exception.UserIdException;
import com.chanti.model.Trainer;
import com.chanti.service.TrainerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/trainer")
@CrossOrigin(origins = "*")
@Api(value = "onlinestore", description = "Operations on Trainer Data")
public class TrainerController 
{
	@Autowired
	private TrainerService service;
	
	//UserIdDoesnotExistException userException=null;
	
	@ApiOperation(value = "Register a Trainer")
	@PostMapping("/signup")
	public String registerTrainer(@RequestBody Trainer trainer) {
		Trainer trainerOb=service.saveTrainer(trainer);
		return trainerOb.getName() +", Ur registration is completed";
	}
	
	@ApiOperation(value = "View a list of available Trainer", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping("/all")
	public List<Trainer> displayAllTrainers(){
		return service.showAllTrainers();
	}
	
	@ApiOperation(value = "Display Trainer By Email")
	@GetMapping("/findbyemail/{email}")
	public Optional<Trainer> displayTrainerByEmail(@PathVariable String email){
		return service.showTrainerByEmailId(email);
	}
	 
		
	@PutMapping("/update")
	public String updateTrainer(@RequestBody Trainer trainer) {
		Trainer updateTrainer= service.updateTrainer(trainer);
		return updateTrainer+ "Ur trainer record is updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteTrainer(@PathVariable int id) throws Exception {
		boolean trainerExists = service.isTrainerExists(id);
		if(trainerExists) {
           service.deleteTrainer(id);
           return new ResponseEntity<>("Employee deleted successfully",HttpStatus.OK);
		}else {
		return null;
		}
	}
}
