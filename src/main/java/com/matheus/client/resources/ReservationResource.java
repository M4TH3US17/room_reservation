package com.matheus.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.client.entities.Reservation;
import com.matheus.client.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationResource {

	@Autowired
	private ReservationService service;
	
	@GetMapping
	public ResponseEntity<List<Reservation>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Reservation> findById(@PathVariable Long id){
		Reservation obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
