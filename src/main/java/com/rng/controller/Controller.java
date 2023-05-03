package com.rng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rng.service.IService;

@RestController
public class Controller {

	@Autowired
	private IService ser;

	@GetMapping(value = "/getNextTrainDetails")
	public ResponseEntity<String> getTrains() {
		return new ResponseEntity<String>(ser.getNextTenTrainDetails(), HttpStatus.OK);

	}

}
