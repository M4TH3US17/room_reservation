package com.matheus.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.client.entities.Reservation;
import com.matheus.client.repository.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository repository;
	
	public List<Reservation> findAll(){
		return repository.findAll();
	}
	
	public Reservation findById(Long id) {
		Optional<Reservation> obj = repository.findById(id);
		return obj.get();
	}
}
