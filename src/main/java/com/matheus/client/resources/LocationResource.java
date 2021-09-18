package com.matheus.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matheus.client.entities.Location;
import com.matheus.client.services.LocationService;

@Controller
@RequestMapping(value = "/locations")
public class LocationResource {
	
	@Autowired
	private LocationService service;
	
	@GetMapping
	public ResponseEntity<List<Location>> findAll(){		
		List<Location> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Location> findById(@PathVariable Long id){
		Location obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}	
