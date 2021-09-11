package com.matheus.client.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.client.entities.Bedroom;

@RestController
@RequestMapping(value = "/bedrooms")
public class BedroomResource {

	@GetMapping
	public ResponseEntity<Bedroom> findAll(){
		Bedroom obj = new Bedroom(1L, 500.00, 'y', "2 quartos e 1 banheiro");
		return ResponseEntity.ok().body(obj);
	}
}
