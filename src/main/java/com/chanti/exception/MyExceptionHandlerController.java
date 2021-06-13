package com.chanti.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class MyExceptionHandlerController {

	@ExceptionHandler(value=UserIdException.class)
	public ResponseEntity<Object> Exception(UserIdException exception) {
		System.out.println("in side MyExceptionHandlerController");
		return new ResponseEntity<>("User id not found:  "+exception.getMessage(),HttpStatus.NOT_FOUND);
		
	}


}
