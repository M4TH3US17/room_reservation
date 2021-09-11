package com.matheus.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.client.entities.Bedroom;
import com.matheus.client.repository.BedroomRepository;

@Service
public class BedroomService {
	
	@Autowired
	private BedroomRepository repository;

	public List<Bedroom> findAll(){
		return repository.findAll();
	}
	
	public Bedroom findById(Long id) {
		Optional<Bedroom> obj = repository.findById(id);
		return obj.get();
	}
}
