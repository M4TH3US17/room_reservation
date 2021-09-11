package com.matheus.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.client.entities.Bedroom;
import com.matheus.client.services.BedroomService;

@RestController
@RequestMapping(value = "/bedrooms")
public class BedroomResource {

	@Autowired
	private BedroomService service;
	
	@GetMapping
	public ResponseEntity<List<Bedroom>> findAll(){
		List<Bedroom> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Bedroom> findById(@PathVariable Long id){
		Bedroom obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
